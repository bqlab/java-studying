public class Account {
	int balance;
	public void deposit(int a) {
		balance = balance + a;
	}
	public void withraw(int a) {
		if (a < balance)
			balance = balance - a;
		else
			throw new NumberFormatException();
	}
	public void setBalance(int a) {
		balance = a;
	}
	public int getBalance() {
		return balance;
	}
}