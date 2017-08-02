package lesson15.homeWork152;

import java.util.Date;


public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(5, 1200, 1, new Date(), "Neptun", "Odessa");
        Room room2 = new Room(7, 1350, 2, new Date(), "Lazurit", "Chornomorske");
        Room room3 = new Room(4, 1100, 2, new Date(), "Vesna", "Odessa");
        Room room4 = new Room(1, 900, 3, new Date(), "Vizit", "Chornomorske");
        Room room5 = new Room(3, 1050, 4, new Date(), "Ozon", "Odessa");

        Room[] rooms = new Room[]{room1, room2, room3, room4, room5};



        System.out.println();




    }
    //private static void find(Room room, API api){
       // System.out.println("method is running... ");
      //  ;
    //}


}
