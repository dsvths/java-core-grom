package lesson4;

/**
 * Created by Savenko on 19.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("Find count");

       TascFindCount tascFindCount = new TascFindCount();

       System.out.println( TascFindCount.findDivCount((short) 1, (short) 10, 2));
        System.out.println( TascFindCount.findDivCount((short) 5, (short) 50, 12));
        System.out.println( TascFindCount.findDivCount((short) 8, (short) 74, 8));


        System.out.println("");
        System.out.println("Sums Compare");

        TascSumsCompare tascSumsCompare = new TascSumsCompare();

        System.out.println(TascSumsCompare.compareSums(13, 12, 24, 57));
        System.out.println(TascSumsCompare.compareSums(45, 56, 34, 43));
        System.out.println(TascSumsCompare.compareSums(453, 45, 123, 335));

        System.out.println("");
        System.out.println("String");

        TascString tascString = new TascString();

        System.out.println(TascString.concat("Дорогу ", "осилит ", "идущий"));

    }
}
