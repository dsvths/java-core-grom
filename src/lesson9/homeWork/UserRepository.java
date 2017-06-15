package lesson9.homeWork;

/**
 * Created by DSV_Discovery on 15.06.2017.
 */
public class UserRepository {
    User[] users = new User[10];

    private User findByld(long id){
       for (User user : users){
           if (user != null && id == user.getId())
               return user;
       }
       return null;
    }

    public User save (User user){
        if (user == null)
            return null;
        if (findByld(user.getId()) != null)
            return null;
        int countPlace = 0;
        for (User user1 : users){
            if (user1 != null)
                countPlace++;
        }
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

        int i =0;
        for (User user1 : users) {
            if (user1.getId() == user.getId()){
                users[i] = user;
                break;
            }
            i++;
        }
        return user;
    }

    void delete (long id){

        int i =0;
        for (User user1 : users) {
            if (user1.getId() == user1.getId()){
                users[i] = user1;
                break;
            }
            i++;
        }
        return;

    }
}
