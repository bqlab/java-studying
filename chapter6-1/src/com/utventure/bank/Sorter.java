
package com.utventure.bank;
	
public class Sorter implements BubbleSort {
	public int[] numbers = new int[10];
	
	public Sorter(int[] numbers) {
		this.numbers = numbers;
	}
	
	@Override
	public int[] start() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++)
				if (isGreater(j, j + 1))
					swap(j, j + 1);
		}
		return numbers;
	}

	@Override
	public void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}

	@Override
	public boolean isGreater(int a, int b) {
		// TODO Auto-generated method stub
		return numbers[a] > numbers[b];
	}
}
