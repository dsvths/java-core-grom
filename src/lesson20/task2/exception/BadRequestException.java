package lesson20.task2.exception;

/**
 * Created by Savenko on 25.10.2017.
 */
public class BadRequestException extends Exception{

    public BadRequestException(String message) {
        super(message);
    }
}
