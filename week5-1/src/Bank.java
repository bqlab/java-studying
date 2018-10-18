import java.util.Scanner;

public class Bank {
	private MileageAccount[] accounts = new MileageAccount[5];
	private int count = 0;
	Scanner scanner = new Scanner(System.in);

	public void menu() {
		System.out.println("1. ���� ����");
		System.out.println("2. �� �Ա�");
		System.out.println("3. �� ���");
		System.out.println("4. �� ����");
		System.out.println("5. VIP ���");
		System.out.println("0. ����");
		switch (scanner.nextInt()) {
		case 0:
			System.exit(0);
			break;
		case 1:
			int a, b, c;
			double d;
			System.out.println("����ȣ: ");
			a = scanner.nextInt();
			System.out.println("�����Աݾ�: ");
			b = scanner.nextInt();
			System.out.println("���̳ʽ��ܰ�: ");
			c = scanner.nextInt();
			System.out.println("���ϸ���: ");
			d = scanner.nextDouble();
			register(a, b, c, d);
			break;
		case 2:
			System.out.println("����ȣ: ");
			int i1 = scanner.nextInt();
			System.out.println("�Ա��� �ݾ�: ");
			getAccount(i1).deposit(scanner.nextInt());
			break;
		case 3:
			System.out.println("����ȣ: ");
			int i2 = scanner.nextInt();
			System.out.println("����� �ݾ�: ");
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

	public void register(int id, int balance, int minus, double mileage) {
		if(getAccount(id) == null) {
			if (count == accounts.length) {
				System.out.println("���̻� �߰��� �� �����ϴ�.");
				return;
			}
			accounts[count] = new MileageAccount(id, balance, minus, mileage);
			count++;
		} else
			System.out.println("�ߺ��� ���̵��Դϴ�.");
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
		System.out.println("�� ������ " + total + "���Դϴ�.");
	}

	public void getVIP() {
		Account vip = new Account(0,0);
		for (int i = 0; i < count; i++) {
			if (vip.getBalance()<accounts[i].getBalance()) {
				vip = accounts[i];
			}			
		}
		if (vip.getBalance()==0) {
			System.out.println("VIP�� �����ϴ�.");
			return;
		}
		System.out.println("VIP�� "+vip.getId()+"�Դϴ�.");
	}
}
