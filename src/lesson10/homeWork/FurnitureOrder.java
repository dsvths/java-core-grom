package lesson10.homeWork;

/**
 * Created by Savenko on 21.06.2017.
 */
public class FurnitureOrder extends Order {
    String furnitureCode;



    @Override
    void validateOrder() {
        if (getBasePrice() >= 500 && getCustomerOwned().getCity() == )

    }

    @Override
    void calculatePrice() {


    }
}
