package lesson10.homeWork;

/**
 * Created by Savenko on 20.06.2017.
 */
public class Customer {
    private String name;
    private String city;
    private String gender;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public Customer(String name, String city, String gender) {
        this.name = name;
        this.city = city;
        this.gender = gender;
    }
}
