package lesson18.hw182;

import java.util.Arrays;

/**
 * Created by Savenko on 02.10.2017.
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findNumbers("kghkhjgfjf 17623 2346 87134 845uyu 488itg")));

    }

    public static int[] findNumbers(String text) {
        int[] res = new int[0];

        String[] array = (text.replaceAll("\\D+", " ").trim()).split(" ");
        res = new int[array.length];
        for (int i = 0; i < array.length; i++)
            if (check(array[i]))
                res[i] = Integer.valueOf(array[i]);
        else {
                System.err.println(" not a number");
            }

        return res;
    }

    private static boolean check(String input) {

        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
