package lesson15.homeWork152;


public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();


}
