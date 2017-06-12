package lesson8.phones;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class Phone {
    int price;
    double weight;
    String countryProduced;

    public Phone(int price, double weight, String countryProduce) {
        System.out.println("Phone constructor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduce;
    }

    void orderPhone() {
        System.out.println("order phone invoked...");
    }

}
