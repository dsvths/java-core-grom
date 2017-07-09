package lesson12;

/**
 * Created by Savenko on 07.07.2017.
 */
public class UkrainianBankSystem implements BankSystem {

    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять:
        //проверить лимит
        //проверить достаточно ли денег
        //снять деньги


        if (!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        //to do - done
        if (!checkFund(amount, user))
            return;
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //снимаем деньги fromUser
        //поплняем toUser

        if (!checkWithdraw(fromUser, amount))
         return;

        if (!checkFund(amount, toUser))
            return;

        //TO DO check fund rules - done

        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);
        //TO DO fund - done
    }

    @Override
    public void paySalary(User user) {
        //TO DO homework - done
        user.setBalance(user.getBalance() + user.getSalary());

    }

    private void printWithdrawalErrorMsg(int amount, User user){
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
    }

    private boolean checkWithdraw(User user, int amount){
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit){
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }

    private void printFundErrorMsg(int amount, User user){
        System.err.println("Can't fund money " + amount + " to user " + user.toString());
    }

    private boolean checkFund(int amount, User user){
        return checkFundLimit(amount, user, user.getBank().getLimitOfFunding());
    }

    private boolean checkFundLimit(int amount, User user, int limit){
        if (amount > limit){
            printFundErrorMsg(amount, user);
            return false;
        }
        return true;
    }
}
