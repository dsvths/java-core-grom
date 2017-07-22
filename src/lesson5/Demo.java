package lesson5;

import java.util.Arrays;

/**
 * Created by Savenko on 21.07.2017.
 */
public class Demo {
    public static void main(String[] args) {

        System.out.println("Count Unique");
        int[] array = {12, 13, 1, 1, 4, 5, 7, 5, 8};
        TascCountUnique tascCountUnique = new TascCountUnique();
        System.out.println(tascCountUnique.uniqueCount(array));

        int[] array1 = {34, 2, 2, 24, 3, 5, 7, 8, 9, 18};
        System.out.println(tascCountUnique.uniqueCount(array1));

        System.out.println();
        System.out.println("Sort Array");
        TascSortArray tascSortArray = new TascSortArray();
        System.out.println(Arrays.toString(tascSortArray.sortAscending(array1)));
        System.out.println(Arrays.toString(tascSortArray.sortDescending(array1)));

        System.out.println();
        System.out.println("Withdrawal");
        String [] names = {"Den", "Boris", "Lora", "Kat", "Peter"};
        int [] balance = {5390, 0, -100, 374, 43};
        TascWithdrawal tascWithdrawal = new TascWithdrawal();
        System.out.println(tascWithdrawal.withdraw(names, balance, "Boris", 25));
        System.out.println(Arrays.toString(balance));

        String [] names1 = {"Den", "Boris", "Lora", "Lora", "Peter"};
        int [] balance1 = {5390, 0, -100, 374, 43};
        TascWithdrawal tascWithdrawal1 = new TascWithdrawal();
        System.out.println(tascWithdrawal1.withdraw(names1, balance1, "Lora", 100));
        System.out.println(Arrays.toString(balance));

        String [] names3 = {"Den", "Boris", "Lora", "Kat", "Peter"};
        int [] balance3 = {5390, 0, -100, 374, 43};
        TascWithdrawal tascWithdrawal3 = new TascWithdrawal();
        System.out.println(tascWithdrawal3.withdraw(names3, balance3, "Den", 390));
        System.out.println(Arrays.toString(balance));

        String [] names2 = {"Den", "Boris", "Lora", "Kat", "Peter"};
        int [] balance2 = {5390, 0, -100, 374, 43};
        TascWithdrawal tascWithdrawal2 = new TascWithdrawal();
        System.out.println(tascWithdrawal2.withdraw(names2, balance2, "Andrew", 250));
        System.out.println(Arrays.toString(balance));



    }
}
