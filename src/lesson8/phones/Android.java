package lesson8.phones;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class Android extends Phone {
    String androidVersion;
    int screenSize;

    String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode) {
       // this.price = price;
       // this.weight = weight;
       // this.countryProduced = countryProduced;
        super(price, weight, countryProduced);

        //this - reference to the current class object(ссылка на объект текущего класса)
        //super - reference to the parent class object(ссылка на объект родительского класса)

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked...");
    }
}
