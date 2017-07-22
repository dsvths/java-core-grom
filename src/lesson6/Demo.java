package lesson6;

import java.util.Date;

/**
 * Created by DSV_Discovery on 12.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Car carObject = new Car(10000, 2015, "Anton");

        System.out.println(carObject.color);
        System.out.println(carObject.horsePower);

        System.out.println(carObject.ownerName);

        carObject.horsePower = 100;

        System.out.println(carObject.horsePower);

        carObject.startRun();
        carObject.stopRun();

        carObject.changeOwner("Test");

        System.out.println(carObject.ownerName);

        Car carObject2 = null;
        System.out.println(carObject2);

        System.out.println();
        System.out.println("Order");
        Order order1 = new Order(200, new Date(), true, null, "Lviv", "Ukraine", "Buy");
        System.out.println(order1.isValidType());
        System.out.println(order1.checkPrice());

        Order order2 = new Order(1100, new Date(), false, null, "Kyiv", "Ukraine", "Sale");
        System.out.println(order2.isValidType());
        System.out.println(order2.checkPrice());

        Order order3 = new Order(1500, new Date(), false, null, "Kyiv", "Ukraine", "Rent");
        System.out.println(order3.isValidType());
        System.out.println(order3.checkPrice());

    }
}
