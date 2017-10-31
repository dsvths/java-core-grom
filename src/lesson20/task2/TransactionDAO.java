package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;
import lesson20.task2.exception.LimitExceeded;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Savenko on 25.10.2017.
 */
public class TransactionDAO {
    private Transaction[] transactions = new Transaction[10];
    private Utils utils = new Utils();

    public Transaction save(Transaction transaction) throws LimitExceeded, InternalServerException, BadRequestException {
//        сумма транзакции больше указанного лимита +
//        сумма транзакций за день больше дневного лимита +
//        количество транзакций за день больше указанного лимита +
//        если город оплаты (совершения транзакции) ++
//        не хватило места++

        if (!validate(transaction))
            return null;

        return transaction;
    }

    private boolean validate(Transaction transaction) throws InternalServerException, BadRequestException {
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit amount exceeded " + transaction.getId() + ". Can't be saved");

        int sum = 0;
        int count = 0;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            sum += tr.getAmount();
            count++;
        }

        if (sum > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit amount per day exceeded " + transaction.getId() + ". Can't be saved");
        }

        if (count > utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day exceeded " + transaction.getId() + ". Can't be saved");
        }

        if (!Arrays.asList(utils.getCities()).contains(transaction.getCity())) {
            throw new BadRequestException("For Transaction " + transaction.getId() + " city " + transaction.getCity() + " is wrong");
        }

        int index = 0;
        for (Transaction transaction1 : transactions) {
            if (transaction1 == null) {
                transactions[index] = transaction;
            }
            index++;
        }
        throw new InternalServerException("Not enough space to save transaction " + transaction.getId());
    }

    Transaction[] transactionList() {
        int index = 0;
        Transaction[] resultList = new Transaction[index];
        for (Transaction tr : transactions) {
            transactions[index] = tr;
            index++;
        }
        return resultList;
    }

    Transaction[] transactionList(String city) {

        int index = 0;
        Transaction[] resultList = new Transaction[index];
        for (Transaction tr : transactions) {
            if (city == tr.getCity()) {
                transactions[index] = tr;
            }
            index++;
        }
        return resultList;
    }

    Transaction[] transactionList(int amount) {
        int index = 0;
        Transaction[] resultList = new Transaction[index];
        for (Transaction tr : transactions) {
            if (amount == tr.getAmount()) {
                transactions[index] = tr;
            }
            index++;
        }
        return resultList;
    }

    private Transaction[] getTransactionsPerDay(Date dateOfCurTransaction) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day)
                    count++;
            }
        }

        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);

                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }
            }
        }
        return result;
    }

}
