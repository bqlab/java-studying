

public class Account {
	private int balance;
	
	public void deposit(int a) {
		balance += a;
	}
	
	public void withdraw(int a) throws IllegalArgumentException {
		if(balance < a)
			throw new IllegalArgumentException();
		else
			balance -= a;
	}
	
	public int get() {
		return balance;
	}
}
