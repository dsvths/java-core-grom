package lesson8.ads;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class User extends BaseEntity{
    long id;
    String userName;
    String location;

    public User(long id, String userName, String location) {
        super(id);
        this.userName = userName;
        this.location = location;
    }
}
