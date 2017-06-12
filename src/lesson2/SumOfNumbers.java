package lesson2;


public class SumOfNumbers {
    public static void main(String[] args) {

        long sum = 0;
        int a = 0;
        while (a <= 10000000) {

            sum += a;
            a++;
        }
        System.out.println(sum);
    }
}

