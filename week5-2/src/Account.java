
public class Account {
	int balance;
	public void deposit(int a) {
		balance = balance + a;
	}
	public void withraw(int a) {
		balance = balance - a;
	}
	public int getBalance() {
		return balance;
	}
}
