package lesson15.homeWork152;


public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        for (Room room : rooms){
            if (room != null && room.getPersons() == persons && price == room.getPrice() && city.equals(room.getCityName()) && hotel.equals(room.getHotelName())){
                index++;
            }
        }
        Room[] finderRoom = new Room[index];
        int i = 0;
        for (Room room1 : rooms) {
            if (room1 != null && room1.getPersons() <= persons && price == room1.getPrice() && city.equals(room1.getCityName()) && hotel.equals(room1.getHotelName())) {
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
