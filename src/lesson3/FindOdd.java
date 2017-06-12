package lesson3;


public class FindOdd {
    public static void main(String[] args) {


        int b = 0;

        for (; b <= 1000; b++) {

            int div = b % 2;

            if (div != 0)
                System.out.println("Found");

           /* else
                System.out.println("Found"); */
             }

        int a = 0;
        int sum =0;

        for (; a <= 1000; a++) {

            int div = a % 2;

            if (div != 0)
                sum = sum + a;
        }

        if (sum * 5 > 5000) {
            System.out.println("Bigger");
        }
        else
            System.out.println("Smaller");

    }
}
