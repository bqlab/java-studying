import java.util.Scanner;
import java.util.Vector;

public class Tester {

	public static void main(String[] args) {
		Vector<Account> accounts = new Vector<Account>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int inputNumber = scanner.nextInt();
			if (inputNumber == -1) {
				System.out.println("입력을 멈춥니다.");
				break;
			} else {
				accounts.add(new Account(inputNumber));
				System.out.println("입력되었습니다.");
			}
		}

		int[] balances = new int[accounts.size()];
		for (int i = 0; i < balances.length; i++)
			balances[i] = accounts.get(i).getBalance();
		balances = new Sorter(balances).start();

		Vector<Account> sortedAccounts = new Vector<Account>();
		for(int i = 0; i < balances.length; i++) {
			for(int j=0;j<accounts.size();j++) {
				if(balances[i] == accounts.get(j).getBalance()) {
					sortedAccounts.add(accounts.get(j));
					System.out.println(sortedAccounts.get(i));
				}					
			}
		}
	}
}
