import java.util.Random;

public class Tester {
	static int[] numbers = new int[10];

	public static void main(String[] args) {
		System.out.println("정렬전");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(99);
			System.out.println(numbers[i]);
		}

		bubbleSort();
		System.out.println("정렬후");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	public static void bubbleSort() {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++)
				if (isGreater(j, j + 1))
					swap(j, j + 1);
		}
	}

	public static void swap(int a, int b) {
		int temp;
		temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}

	public static boolean isGreater(int a, int b) {
		return numbers[a] > numbers[b];
	}
}
