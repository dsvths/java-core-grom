package lesson16.homeWork17;

import java.util.regex.Pattern;

/**
 * Created by Savenko on 11.09.2017.
 */
public class Solution {
    public static void main(String[] args) {

        String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";


        //System.out.println(check(test));

        System.out.println(countWords(test));
    }

    public static int countWords(String input) {

        String[] words = input.split(" ");

        int[] res = new int[words.length];

        //check(words);

        int count = 0;

        for (int i = 0; i < words.length; i++)
            if (check(words[i]))
                count++;
        return count;
    }

    private static boolean check(String str) {
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c))
                return false;
        }
        return true;
    }

}

