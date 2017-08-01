package lesson15.homeWork15;

import java.util.Arrays;

/**
 * Created by Savenko on 01.08.2017.
 */
public class UserRepository {

    User[] users = new User[10];

    public User save (User user){
        if (user == null)
            return null;
        if (findById(user.getId()) != null)
            return null;
        int countPlace = 0;
        for (User us : users){
            if (us != null)
                countPlace++;
        }

        if (countPlace > 9)
            return null;

        int i = 0;
        for (User user1 : users) {
            if (user1 == null) {
                users[i] = user;
                break;
            }
            i++;
        }
        return user;
    }

    public User update (User user){
        if (user == null)
            return null;
        User curUser = findById(user.getId());
        if (curUser == null)
            return null;

        long curUserId = curUser.getId();


        int i =0;
        for (User us : users) {
            if (us != null && us.getId() == user.getId()){
                users[i] = user;
                break;
            }
            i++;
        }
        return user;
    }


    void delete (long id){

        User user = findById(id);
        if (user == null)
            return;
        int i =0;
        for (User user1 : users) {
            if (user1.equals(users)){
                users[i] = user1;
                break;
            }
            i++;
        }
    }

    private User findById(long id){
        for (User user : users){
            if (user != null && user.equals(id))
                return user;
        }
        return null;
    }




    public User[] getUsers(){return users;}

    public User getFindById(long id) {return findById(id);}
}
