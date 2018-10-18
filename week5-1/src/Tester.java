
public class Tester {

	public static void main(String[] args) {
		MileageAccount m = new MileageAccount(99, 0, 0, 0.1);
		m.deposit(1000);
		System.out.println("ภÜพื: " + m.getBalance());
	}
}
