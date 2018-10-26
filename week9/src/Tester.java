

public class Tester {
	//예외처리수업
	public static void main(String[] args) {
		Account lee = new Account();
		lee.deposit(100);
		lee.withdraw(1000);
		try {
			System.out.println(lee.get());
		}
		catch (IllegalArgumentException e) {
			
		}
		//int[] data = {1,2,3,4} ;
		//System.out.println(data[0]);
		//System.out.println(data[4]);
		//System.out.println(12/0);
		/*
		try {
			System.out.println(data[0]);
			System.out.println(data[4]);
			System.out.println(12/0);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누는 것은 안 됩니다.");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 오류");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("실행됨.");
		}
		*/
	}
}
