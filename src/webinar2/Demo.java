package webinar2;

/**
 * Created by Savenko on 29.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validate("https://www.test.com"));
        System.out.println(solution.validate("https://www.test@.com"));
        System.out.println(solution.validate("http://test.com"));
    }
}
