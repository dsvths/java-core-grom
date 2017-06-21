package lesson10.homeWork;

/**
 * Created by Savenko on 20.06.2017.
 */
public class ElectronicsOrder extends Order {
    int guarantyMonth;

    String[] city = new String[]{"Киев", "Одесса", "Днепр", "Харьков"};




    @Override
    void validateOrder() {
        if (getBasePrice() >= 100 && (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() =="Одесса") && getCustomerOwned().getGender() =="Женский");




    }

    @Override
    void calculatePrice() {

    }
}
