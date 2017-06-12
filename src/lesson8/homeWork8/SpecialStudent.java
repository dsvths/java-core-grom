package lesson8.homeWork8;

/**
 * Created by Savenko on 10.06.2017.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}
