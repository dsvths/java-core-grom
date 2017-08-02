package lesson15.homeWork152;


public class BookingComAPI implements API {

    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        for (Room rooms : rooms){
            if (rooms != null && (rooms.getPrice() <= (price + 100) || rooms.getPrice() >= (price - 100)) && persons == rooms.getPersons() && city == rooms.getCityName() && hotel == rooms.getHotelName()){
                index++;
            }
        }
        Room[] finderRoom = new Room[index];
        int i = 0;
        for (Room room : rooms){
            if (room != null && (room.getPrice() <= (price +100) || room.getPrice() >= (price - 100)) && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()){
                finderRoom[i] = room;
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
