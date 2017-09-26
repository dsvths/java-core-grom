package lesson18;

/**
 * Created by Savenko on 26.09.2017.
 */
public class Definition {

    private void notifyUser(String[] userEmails) {

        for (String email : userEmails){

            //обработка ошибок
            try {
                //send email to user - error
                System.out.println("Email " + email + "was sent");
                //
                //
                //
            } catch (Exception e) {
                //how should I handle exception
                System.err.println("Email " + email + "was not sent");
            } finally {
                //updateStatus
            }
//            } catch (type2 e) {
//
//
//            }

        }
    }
}
