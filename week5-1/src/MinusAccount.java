
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
			System.out.println("�ѵ��� �ʰ��Ǿ����ϴ�.");
			return amount;
		}
		balance -= amount;
		return amount;
	}
}
