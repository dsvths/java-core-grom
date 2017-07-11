package lesson12;

/**
 * Created by Savenko on 07.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222, "Sweden", Currency.USD, 100, 1400, 4, 444343434);
        Bank euBank = new EUBank(1372, "Austria", Currency.EUR, 210, 1350, 5, 735463789);
        Bank chBank = new ChinaBank(2723, "China", Currency.USD, 95, 1100, 3, 847856475);

        User user = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);

        BankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user, 150);
        System.out.println(user.getBalance());

        User user1 = new User(1002, "Roman", 5700, 25, "Skyline", 1100, usBank);
        //BankSystem bankSystem1 = new UkrainianBankSystem();
        bankSystem.paySalary(user1);
        System.out.println(user1.getBalance());

        User user2 = new User(1003, "Eugen", 7538, 18, "Booking", 3000, euBank);
        bankSystem.transferMoney(user, user2, 150);
        System.out.println(user2.getBalance());

        User user3 = new User(712, "Katia", 9270, 11, "Kola", 1800, euBank);
        bankSystem.fund(user3, 3700);
        System.out.println(user3.getBalance());

        User user4 = new User(877, "Sonia", 590, 13, "IPOOD", 830, chBank);
        bankSystem.withdraw(user4, 70);
        System.out.println(user4.getBalance());

        User user5 = new User(1212, "Liuda", 15590, 35, "RMP", 1830, chBank);
        bankSystem.fund(user5, 7300);
        System.out.println(user5.getBalance());
    }
}
