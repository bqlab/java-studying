package week7;

public class FiveIntegers implements Compare{
	int [] data;
	
	public FiveIntegers() {
		data = new int[5];
		data[0] = 1;
		data[1] = 4;
		data[2] = 3;
		data[3] = 8;
		data[4] = 2;
	}
	
	public static void main(String[] args) {
		FiveIntegers fiveIntegers = new FiveIntegers();
		Utils utils = new Utils();
		System.out.println("가장 큰 값의 인덱스: "+utils.findMax(fiveIntegers, 0, 4));
	}

	@Override
	public boolean isGreater(int idx1, int idx2) {
		// TODO Auto-generated method stub
		return data[idx1] > data[idx2];
	}
}
