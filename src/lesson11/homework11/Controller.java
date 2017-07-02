package lesson11.homework11;

/**
 * Created by Savenko on 02.07.2017.
 */
public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }
    private Room[] requestRooms(int price, int persons, String city, String hotel){
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

    private Room[] check(API api1, API api2) {
        Room[] rooms = new Room[5];
        for (API api : apis) {
            if (api1 == api2);

        }
        return new Room[api1];

    }

}
