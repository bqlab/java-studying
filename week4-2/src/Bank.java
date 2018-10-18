import java.util.Scanner;

public class Bank {
	private Account[] accounts = new Account[5];
	private int count = 0;
	Scanner scanner = new Scanner(System.in);

	public void menu() {
		System.out.println("1. 계좌 개설");
		System.out.println("2. 고객 입금");
		System.out.println("3. 고객 출금");
		System.out.println("4. 총 예금");
		System.out.println("5. VIP 출력");
		System.out.println("0. 종료");
		switch (scanner.nextInt()) {
		case 0:
			System.exit(0);
			break;
		case 1:
			int a, b;
			System.out.println("고객번호: ");
			a = scanner.nextInt();
			System.out.println("최초입금액: ");
			b = scanner.nextInt();
			register(a, b);
			break;
		case 2:
			System.out.println("고객번호: ");
			int i1 = scanner.nextInt();
			System.out.println("입금할 금액: ");
			getAccount(i1).deposit(scanner.nextInt());
			break;
		case 3:
			System.out.println("고객번호: ");
			int i2 = scanner.nextInt();
			System.out.println("출금할 금액: ");
			getAccount(i2).withdraw(scanner.nextInt());
			break;
		case 4:
			getTotal();
			break;
		case 5:
			getVIP();
			break;
		}
	}

	public void register(int id, int balance) {
		if(getAccount(id) == null) {
			if (count == accounts.length) {
				System.out.println("더이상 추가할 수 없습니다.");
				return;
			}
			accounts[count] = new Account(id, balance);
			count++;
		} else
			System.out.println("중복된 아이디입니다.");
	}

	public Account getAccount(int id) {
		for (int i = 0; i < count; i++) {
			if (accounts[i].getId() == id) {
				return accounts[i];
			}
		}
		return null;
	}

	public void getTotal() {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += accounts[i].getBalance();
		}
		System.out.println("총 예금은 " + total + "원입니다.");
	}

	public void getVIP() {
		Account vip = new Account(0,0);
		for (int i = 0; i < count; i++) {
			if (vip.getBalance()<accounts[i].getBalance()) {
				vip = accounts[i];
			}			
		}
		if (vip.getBalance()==0) {
			System.out.println("VIP가 없습니다.");
			return;
		}
		System.out.println("VIP는 "+vip.getId()+"입니다.");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		while (true) {
			bank.menu();
		}
	}
}
