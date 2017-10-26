package lesson20.task1.exception;

/**
 * Created by Savenko on 19.10.2017.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }
}
