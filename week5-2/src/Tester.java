import java.util.Random;

public class Tester {
	static Account[] accounts;
	static Sorter sorter;

	public static void main(String[] args) {
		int[] balances = new int[10];
		accounts = new Account[10];
		System.out.println("정렬전");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].setBalance(new Random().nextInt(99));
			balances[i] = accounts[i].getBalance();
			System.out.println(balances[i]);
		}

		sorter = new Sorter(balances);
		balances = sorter.start();
		System.out.println("정렬후");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].setBalance(balances[i]);
			System.out.println(accounts[i].getBalance());
		}
	}
}
