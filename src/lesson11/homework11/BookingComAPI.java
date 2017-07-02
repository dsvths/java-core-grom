package lesson11.homework11;

/**
 * Created by Savenko on 29.06.2017.
 */
public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        for (Room rooms : rooms){
            if (rooms != null && price <= (rooms.getPrice() + 100) || price >= (rooms.getPrice() - 100)){
                if (persons == rooms.getPersons() && city == rooms.getCityName() && hotel == rooms.getHotelName());
                index++;
            }
        }
        Room[] finderRoom = new Room[index];
        int i = 0;
        for (Room room : rooms){
            if (room != null && price <= (room.getPrice() +100) || price >= (room.getPrice() - 100) && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()){
            finderRoom[i] = room;
            i++;
            }
        }



        return finderRoom;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
