package lesson4;

public class TascSumsCompare {
    public static void main(String[] args) {
        System.out.println(compareSums(45, 72, 21, 43));

    }

    public static boolean compareSums(int a, int b, int c, int d) {

        return (sum(a, b) > sum(c, d));
    }

    public static long sum(int from, int to) {

        long res = 0;
        for (long i = from; i <= to; i++) {
            res += i;
        }
        return res;
    }


}
