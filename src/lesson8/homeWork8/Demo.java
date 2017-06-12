package lesson8.homeWork8;

/**
 * Created by Savenko on 10.06.2017.
 */
public class Demo {
    public Student craeteHighestParent() {
        Student student1 = new Student("Denis", "Potapov", 5, new Course[3]);


        return student1;
    }

    public SpecialStudent createLowestChild(){
        SpecialStudent specialStudent1 = new SpecialStudent("Oleg", "Kot", 5, new Course[3], 2354, "dsvths@gmail.com");

        return specialStudent1;
    }

}
