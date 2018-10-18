
public class MinusAccount extends Account {
	int minus;

	public MinusAccount(int id, int minus) {
		super(id);
		this.minus = minus;
	}
	
	public MinusAccount(int id, int balance, int minus) {
		super(id, balance);
		this.minus = minus;
	}

	public int withdraw(int amount) {
		if (balance - (amount + minus) < 0) {
			System.out.println("한도가 초과되었습니다.");
			return amount;
		}
		balance -= amount;
		return amount;
	}
}
