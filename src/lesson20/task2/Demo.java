package lesson20.task2;

import java.util.Date;

/**
 * Created by Savenko on 31.10.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(12, "Kiev", 2345, "refill", TransactionType.valueOf("refill"), new Date());
        TransactionDAO transactionDAO = new TransactionDAO();
        //Controller controller = new Controller();



    }
}
