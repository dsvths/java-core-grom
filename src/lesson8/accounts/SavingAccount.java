package lesson8.accounts;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class SavingAccount extends Account {
    int savingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

    @Override
    void changeOwnerName(String newOwnerName) {
        if (newOwnerName == "Jeck" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account");
    }
}
