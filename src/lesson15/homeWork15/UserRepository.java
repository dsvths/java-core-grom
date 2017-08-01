package lesson15.homeWork15;

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


//        int i =0;
//        for (User us : users) {
//            if (us != null && us.getId() == user.getId()){
//                users[i] = user;
//                break;
//            }
//            i++;
//        }
//        return user;
//    }

        int i =0;
        for (User us : users) {
            if (us != null && us.equals(user)){
                users[i] = user;
                break;
            }
            i++;
        }
        return user;
    }



//    void delete (long id){
//
//        int i =0;
//        for (User user1 : users) {
//            if (user1.getId() == user1.getId()){
//                users[i] = user1;
//                break;
//            }
//            i++;
//        }
//    }

    void delete (long id){

        int i =0;
        for (User user1 : users) {
            if (user1.equals(user1)){
                users[i] = user1;
                break;
            }
            i++;
        }
    }

    private User findById(long id){
        for (User user : users){
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }

    public User[] getUsers(){return users;}

    public User getFindById(long id) {return findById(id);}
}
