package lesson11.homework11;

/**
 * Created by Savenko on 02.07.2017.
 */
public class TripAdvisorAPI implements API{
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        for (Room room : rooms){
            if (room != null && ((room.getPersons() <= persons + 1) || (room.getPersons() >= persons - 1)) && price == room.getPrice() && city == room.getCityName() && hotel == room.getHotelName()){
                index++;
            }
        }
        Room[] finderRoom = new Room[index];
        int i = 0;
        for (Room room1 : rooms) {
            if (room1 != null && ((room1.getPersons() <= persons + 1) || (room1.getPersons() >= persons - 1)) && price == room1.getPrice() && city == room1.getCityName() && hotel == room1.getHotelName()) {
                finderRoom[i] = room1;
                i++;
            }
        }

        return finderRoom;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
