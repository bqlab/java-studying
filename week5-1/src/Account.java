public class Account {
	protected int id;
	protected int balance;
	public Account(int id) {
		this.id = id;
	}
	public Account(int id, int balance) {
		this.id = id;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance = balance + amount;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
}
