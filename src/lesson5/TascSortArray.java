package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TascSortArray {
    public static void main(String[] args) {
        int[] array = {100, 250, 320, 10, 18, 27, 148};

        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

   public static int [] sortAscending (int[] array) {
        Arrays.sort(array);
        return array;
    }
    public static int [] sortDescending (int[] array) {
        int [] res = new int[array.length];
        for (int i = 0, k = res.length - 1; i < array.length; i++, k--) {
            res[k] = array[i];
        }
            return res;
        }
    }

