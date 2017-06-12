package lesson5;

import java.util.Arrays;

public class TascCountUnique {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 1, 1, 1, 4, 4, 5, 5, 5};

        System.out.println(uniqueCount(array));
    }

    static int uniqueCount (int[] array) {
        if (array.length ==0) {
            return 0;
        }

        int count = 1;
        boolean flag = true;

        for (int i = 1; i < array.length; i++) {
            flag = true;

            for (int n = i - 1; n >= 0; n--) {
                if (array [n] == array [i]) {
                    flag = false;
                }
            }

           if (flag) {
                count++;
            }
        }
        return count;
    }
}
