package lesson20.task2;

import lesson20.task2.exception.BadRequestException;
import lesson20.task2.exception.InternalServerException;

/**
 * Created by Savenko on 25.10.2017.
 */
public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();



    public Transaction save(Transaction transaction) throws BadRequestException, InternalServerException {
        return transactionDAO.save(transaction);

        //create response
        //return response
    }

    Transaction[] transactionList() {

        return transactionDAO.transactionList();
    }

    Transaction[] transactionList(String city) {

        return transactionDAO.transactionList();
    }

    Transaction[] transactionList(int amount) {

        return transactionDAO.transactionList();
    }
}
