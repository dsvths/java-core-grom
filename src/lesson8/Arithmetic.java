package lesson8;

public class Arithmetic {

    public boolean check (int[] array) {
        int[] exArray = new int[5];

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < exArray.length; i++) {
            max = Math.max(max, exArray [i]);
            min = Math.min(min, exArray [i]);
        }

        int sum = max + min;
        boolean a = sum > 100;
        return true;
    }
}
