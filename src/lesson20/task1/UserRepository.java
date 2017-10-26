package lesson20.task1;

import lesson20.task1.exception.BadRequestException;
import lesson20.task1.exception.InternalServerException;
import lesson20.task1.exception.UserNotFoundException;

/**
 * Created by DSV_Discovery on 15.06.2017.
 */
public class UserRepository {
    User[] users = new User[10];

    public User findById(long id) throws UserNotFoundException {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        throw new UserNotFoundException("User with ID " + id + " not found");
    }

    public User save(User user) throws Exception{
        if (user == null)
            throw new BadRequestException("Can't save null user");

        try {
            findById(user.getId());
            throw new BadRequestException("User with id: " + user.getId() + " already exist");
        } catch (UserNotFoundException e) {
            System.out.println("User with id: " + user.getId() + " already exist. Will be saved.");
        }

        int index = 0;
        for (User user1 : users) {
            if (user1 == null) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServerException("Not enough space to save user with id: " + user.getId());
    }

    public User update(User user) throws Exception {
        if (user == null)
            throw new BadRequestException("Can't update null user");

        findById(user.getId());

        int index = 0;
        for (User user1 : users) {
            if (user1 != null && user1.getId() == user.getId()) {
                users[index] = user;
                return users[index];
            }
            index++;
        }
        throw new InternalServerException("Unexpected error");
    }

    void delete(long id) throws Exception {
        findById(id);

        int index = 0;
        for (User user1 : users) {
            if (user1.getId() == id) {
                users[index] = null;
                break;
            }
            index++;
        }
    }
}
