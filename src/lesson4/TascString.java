package lesson4;

public class TascString {
    public static void main(String[]args){

        System.out.println(concat("First ", "Second ", "Third"));
    }

    public static String concat (String a, String b, String c) {

        String res = a + b + c;

        return res;
    }
}
