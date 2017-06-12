package lesson2;


public class SumAndDivision {
    public static void main(String[] args) {
        int a = 1;
        int sum = 1;
        while (a <= 1000) {
            sum += a;
            a++;
        }
        int div = sum / 1234;
        //System.out.println(div);

        int mod = sum % 1234;
        //System.out.println(mod);

        boolean res = div < mod;

        System.out.println(res);
    }
}
