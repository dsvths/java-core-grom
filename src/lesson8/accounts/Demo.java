package lesson8.accounts;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBank", "Denis", 1000, 50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);

        savingAccount.changeOwnerName("Oleg");

        System.out.println(savingAccount.ownerName);

        //-----------------------------------------------------------------------

        CheckingAccount checkingAccount = new CheckingAccount("SomeBank", "Denis", 1000, 500);

        checkingAccount.changeOwnerName("Oleg");

        System.out.println(checkingAccount.ownerName);

    }
}
