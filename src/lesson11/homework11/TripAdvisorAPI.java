package lesson11.homework11;

/**
 * Created by Savenko on 02.07.2017.
 */
public class TripAdvisorAPI implements API{
    private Room[] rooms = new Room[5];

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        for (Room rooms : rooms){
            if (rooms != null && (persons <= rooms.getPersons() + 1) || (persons >= rooms.getPersons() - 1));
        }
        return new Room[0];
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
