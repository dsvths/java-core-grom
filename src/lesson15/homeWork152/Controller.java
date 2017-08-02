package lesson15.homeWork152;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }
    public Room[] requestRooms(int price, int persons, String city, String hotel){
        int index = 0;
        for (API api: apis){
            index += api.findRooms(price, persons, city, hotel).length;
        }
        Room[] result = new Room[index];

        int index2 = 0;
        for (API api : apis){
            if (api != null)
            for (Room room : api.findRooms(price, persons, city, hotel)) {
                result[index2] = room;
                index2++;
            }
        }
        return result;
    }

    public Room[] check(API api1, API api2) {
        Room[] roomsAPI1 = api1.getAll();
        Room[] roomsAPI2 = api2.getAll();
        Room[] result;
        int index = 0;

        for (Room roomApi1 : roomsAPI1) {
            for (Room roomApi2 : roomsAPI2) {
                if (roomApi1 != null && roomApi2 != null && roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getHotelName().equals(roomApi2.getHotelName()) && roomApi1.getCityName().equals(roomApi2.getCityName()))

                index++;
            }
        }

        result = new Room[index];
        int i = 0;

        for (Room roomApi1 : roomsAPI1) {
            for (Room roomApi2 : roomsAPI2) {
                if (roomApi1 != null && roomApi2 != null && roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getHotelName().equals(roomApi2.getHotelName()) && roomApi1.getCityName().equals(roomApi2.getCityName())) {
                    result[i] = roomApi1;
                    i++;
                }
            }
            //return result;
        }
        return result;
    }



}
