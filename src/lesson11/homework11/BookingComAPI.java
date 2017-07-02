package lesson11.homework11;

/**
 * Created by Savenko on 29.06.2017.
 */
public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        for (Room rooms : rooms){
            if (rooms != null && price <= (rooms.getPrice() + 100) || price >= (rooms.getPrice() - 100));
        }

        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
