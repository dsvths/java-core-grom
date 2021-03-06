package lesson16.homeWork17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * Created by Savenko on 11.09.2017.
 */
public class Solution {
    public static void main(String[] args) {

        String test = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        String gon = "*&^%$$ &^% #$)(@#! 734618324667";

        String test2 = "";

        System.out.println(countWords(test));

        System.out.println(maxWord(gon));

        System.out.println(minWord(test));

        System.out.println(mostCountedWord(test2));

    }


    public static int countWords(String input) {

        String[] words = input.split(" ");

        int[] res = new int[words.length];

        //check(words);

        int count = 0;

        for (int i = 0; i < words.length; i++)
            if (check(words[i]) && !words[i].isEmpty())
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

    public static String maxWord(String input){
        String[] words = input.split(" ");
        String maxWord = null;

        if (words.length == 0)
            return null;

        for (String word : words)
            if (word.length() > 0 && check(word) && !word.isEmpty()) {
                maxWord = word;
                break;
            }

        if (maxWord == null)
            return null;

        for (String word : words)
            if (maxWord.length() < word.length() && check(word) && !word.isEmpty())
                maxWord = word;
            return maxWord;

    }

    public static String minWord(String input){
        String[] words = input.split(" ");
        String minWord = null;

        if (words.length == 0)
            return null;

        for (String word : words)
            if (word.length() > 0 && check(word) && !word.isEmpty()) {
                minWord = word;
                break;
            }

        if (minWord == null)
            return null;

        for (String word : words)
            if (minWord.length() > word.length() && check(word) && !word.isEmpty())
                minWord = word;
        return minWord;
    }

    public static String mostCountedWord(String input){
        if (input.isEmpty())
            return  null;

        String[] words = input.split(" ");

        String maxWord = null;
        int maxCount = 0;

        for (String word : words) {
            int count = 0;
            for (String item : words) {
                if (word.equals(item) && check(item) && word.length() > 0) {
                    count++;
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
        }

        return maxWord;
    }
}

