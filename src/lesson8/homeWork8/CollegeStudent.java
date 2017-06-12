package lesson8.homeWork8;

/**
 * Created by Savenko on 10.06.2017.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;


    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken) {
        super(firstName, lastName, group, coursesTaken);


    }
}
