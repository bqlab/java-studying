

public class Account {
	private int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public String toString() {
		return Integer.toString(balance);
	}
	public void deposit(int amount) {
		balance = balance + amount;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
}