
public class MileageAccount extends MinusAccount{
	double mileage;
	
	public MileageAccount(int id, int balance, int minus, double mileage) {
		super(id, balance, minus);
		this.mileage = mileage;
	}
	
	public void deposit(int amount) {
		balance = (int) (balance + (amount+(amount*mileage)));
	}
}
