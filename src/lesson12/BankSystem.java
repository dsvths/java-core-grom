package lesson12;

/**
 * Created by Savenko on 07.07.2017.
 */
public interface BankSystem {

    void withdraw(User user, int amount);

    void fund(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
