package lesson8;


public class Demo {
    public static void main(String[] args) {
        Adder obAdder = new Adder();
        System.out.println(obAdder.check(new int[]{18, 5, 27, 104,72}));
        obAdder.add(7, 8);
    }
}
