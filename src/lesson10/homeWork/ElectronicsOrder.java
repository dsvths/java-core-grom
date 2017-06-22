package lesson10.homeWork;


import java.util.Date;

/**
 * Created by Savenko on 20.06.2017.
 */
public class ElectronicsOrder extends Order {
    private int guarantyMonth;

    //private String[] city = {"Киев", "Одесса", "Днепр", "Харьков"};
   /* private String gender = "Женский";


    public boolean condition(String[] city, String gender) {
        getCustomerOwned().getCity();
        getCustomerOwned().getGender();

    }*/

    public ElectronicsOrder(String itemName, Date dateCreated, String shipToCity, int basePrice, Customer customerOwned, int guarantyMonth) {
        super(itemName, dateCreated, shipToCity, basePrice, customerOwned);
        this.guarantyMonth = guarantyMonth;
    }

    @Override
    void validateOrder() {
        if (getBasePrice() >= 100 && getCustomerOwned().getGender() =="Женский");
        if (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() =="Одесса" || getCustomerOwned().getCity() =="Днепр" || getCustomerOwned().getCity() =="Харьков");
        if (getShipToCity() == "Киев" || getShipToCity() == "Днепр" || getShipToCity() == "Одесса" || getShipToCity() == "Харьков");

        setDateConfirmed(new Date());
    }

    @Override
    void calculatePrice() {
        double price = 0;
        if (getBasePrice() >= 5000) {
            price = getBasePrice() + getBasePrice()*0.02;
        }
        price = getBasePrice() + getBasePrice()*0.05;

        setTotalPrice(price);

    }
}
