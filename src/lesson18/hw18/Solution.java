package lesson18.hw18;

import java.util.Arrays;

/**
 * Created by Savenko on 28.09.2017.
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(findNumbers(" gjhft 17623 2346 87134 845uyu 488itg")));

    }

    public static int[] findNumbers(String text){
        String[] words = text.split(" ");

        int[] res = new int[words.length];

        try {
            for (String word : words) {
                for (int i = 0; i < words.length; i++) {
                    if (check(word))
                        res[i] = Integer.parseInt(words[i]);
                }
            }
        } catch (Exception e) {
            for (String word : words)
                if (!check(word))
            System.err.println(word + " is not a number");
        }

        return res;
    }

    private static boolean check(String input){

        char[] chars = input.toCharArray();

        for (char c : chars){
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
