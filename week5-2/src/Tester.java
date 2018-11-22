import java.util.Random;

public class Tester {
	static Account[] accounts = new Account[10];

	public static void main(String[] args) {
		System.out.println("정렬전");
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].setBalance(new Random().nextInt(99));
			System.out.println(accounts[i].getBalance());
		}

		bubbleSort();
		System.out.println("정렬후");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].getBalance());
		}
	}

	public static void bubbleSort() {
		for (int i = 0; i < accounts.length - 1; i++) {
			for (int j = 0; j < accounts.length - 1 - i; j++)
				if (isGreater(j, j + 1))
					swap(j, j + 1);
		}
	}

	public static void swap(int a, int b) {
		int temp = accounts[a].getBalance();
		accounts[a].setBalance(accounts[b].balance);
		accounts[b].setBalance(temp);
	}

	public static boolean isGreater(int a, int b) {
		return accounts[a].getBalance() > accounts[b].getBalance();
	}
}
