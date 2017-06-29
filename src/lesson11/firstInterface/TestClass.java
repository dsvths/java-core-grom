package lesson11.firstInterface;

/**
 * Created by Savenko on 23.06.2017.
 */
public class TestClass implements FirstInterface {

    private int test =10;

    @Override
    public void send() {
        //some logic
    }

    @Override
    public String receive() {
        //some logic
        return null;
    }
}
