package lesson10.homeWork;

import java.util.Date;

/**
 * Created by Savenko on 21.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
        ElectronicsOrder tv = new ElectronicsOrder("Sony", new Date(), "Одесса", 2500, new Customer("Nataly", "Одесса", "Женский"), 12);
        tv.validateOrder();
        tv.calculatePrice();
        tv.confirmShipping();


        ElectronicsOrder phone = new ElectronicsOrder("IPhone 7", new Date(), "Киев", 21300, new Customer("Ольга", "Киев", "Женский"), 6);
        phone.validateOrder();
        phone.calculatePrice();
        phone.confirmShipping();


        FurnitureOrder furnitureOrder = new FurnitureOrder("Cupboard", new Date(), "Львов", 7900, new Customer("Василий", "Донецк", "Мужской"), "7");
        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();
        furnitureOrder.confirmShipping();


        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Table", new Date(), "Киев", 5200, new Customer("Роман", "Кропивницкий", "Мужской"), "9");
        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();








    }





}
