package lesson20.task1.exception;

/**
 * Created by Savenko on 19.10.2017.
 */
public class BadRequestException extends Exception {

    public BadRequestException(String message) {
        super(message);
    }
}
