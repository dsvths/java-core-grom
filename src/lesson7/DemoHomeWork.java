package lesson7;

import lesson6.Order;

import java.util.Date;

/**
 * Created by DSV_Discovery on 16.05.2017.
 */
public class DemoHomeWork {

    public Order createOrder(){

        Order order = new Order();

       return  order;
    }

    public Order createOrderAndCallMethods(){

        Order order2 = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        order2.checkPrice();
        order2.isValidType();

        return order2;

    }

}
