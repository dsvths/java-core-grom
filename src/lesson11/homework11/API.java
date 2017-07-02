package lesson11.homework11;

/**
 * Created by Savenko on 29.06.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
