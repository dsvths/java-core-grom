package lesson8.phones;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110, 10.0, "China", true);
        iPhone.deleteIPhoneFromDb();
        iPhone.orderPhone();
    }
}
