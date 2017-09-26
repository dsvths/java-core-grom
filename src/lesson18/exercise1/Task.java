package lesson18.exercise1;

/**
 * Created by Savenko on 26.09.2017.
 */
public class Task {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage();
        String[] fileNames = {"test1", "test2"};
        fileStorage.setFile(fileNames);

        System.out.println("Start printing name... ");

        printer(fileStorage);

        System.out.println("Done");
    }

    public static void printer(Storage storage) {
        String[] names = storage.getFile();

        try {
            System.out.println("5th name is " + names[4]);
        } catch (Exception e){
            System.err.println("5th name can not be found...");
            //System.err.println(e.getMessage());
        }
    }
}
