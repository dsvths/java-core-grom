package lesson10.homeWork;

import java.util.Date;

/**
 * Created by Savenko on 21.06.2017.
 */
public class FurnitureOrder extends Order {
    String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getBasePrice() >= 500 && getCustomerOwned().getName() !="Тест"){
            if (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() == "Львов")
            setDateConfirmed(new Date());
        }

        setDateConfirmed(new Date());

    }

    @Override
    public void calculatePrice() {
        double price = 0;
        if (getBasePrice() > 5000){
            price = getBasePrice() + (getBasePrice()*0.02);
        }
        price = getBasePrice() + (getBasePrice()*0.05);

        setTotalPrice(price);

    }
}
