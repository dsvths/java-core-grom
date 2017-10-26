package lesson20.task2.exception;

/**
 * Created by Savenko on 25.10.2017.
 */
public class LimitExceeded extends BadRequestException{

    public LimitExceeded(String message) {
        super(message);
    }
}
