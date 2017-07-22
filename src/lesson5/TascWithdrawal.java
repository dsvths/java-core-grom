package lesson5;

import java.util.Arrays;

public class TascWithdrawal {
    public static void main(String[] args) {
        String [] names = {"Ann", "Dan", "Michel", "Rouse", "Ted"};
        int [] balances = {1000, 1200, 2700, 570, 15};


        withdraw(names, balances, "Dan", 2000);

        System.out.println(Arrays.toString(balances));
    }

    static int withdraw (String[] clients, int[] balances, String client, int amount) {

            int clientIndex = findClientByName(clients, client);
            if (balances[clientIndex] < amount)
                return -1;



       /*if (balances[findClientByName(clients, client)] < 0)

           return -1;*/

        balances[findClientByName(clients, client)] -= amount;

        return balances[findClientByName(clients, client)];

    }

    static int findClientByName (String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients){
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }

    /*static  int calculateRemainderAmount (int amount) {


        return amount;
    }*/


}
