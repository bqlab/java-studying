import java.util.Random;

import com.utventure.bank.CustomerAccount;
import com.utventure.bank.Sorter;

public class Tester {

	public static void main(String[] args) {
		CustomerAccount[] bank = new CustomerAccount[10];
		for (int i = 0; i < bank.length; i++) {
			int id = i;
			int balance = new Random().nextInt(10000);
			bank[i] = new CustomerAccount(id, balance, 0, 0);
		}

		int[] balances = new int[10];
		for (int i = 0; i < balances.length; i++)
			balances[i] = bank[i].getBalance();

		balances = new Sorter(balances).start();
		CustomerAccount[] sortedBank = new CustomerAccount[10];
		for (int i = 0; i < balances.length; i++) {
			for (int j = 0; j < bank.length; j++) {
				if (balances[i] == bank[j].getBalance()) {
					int id = bank[j].getId();
					int balance = bank[j].getBalance();
					sortedBank[i] = new CustomerAccount(id, balance, 0, 0);
				}
			}
		}

		for (int i = sortedBank.length; i > 0; i--) {
			int rank = sortedBank.length - i +1;
			System.out.println(rank + "µî: " + sortedBank[i-1].getId() + ", " + sortedBank[i-1].getBalance());
		}
	}
}