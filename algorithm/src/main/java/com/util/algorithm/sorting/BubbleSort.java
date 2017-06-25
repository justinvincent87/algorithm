package com.util.algorithm.sorting;

public class BubbleSort implements Sort {

	public Integer[] sort(Integer[] unSortedNumbers) {

		Integer size = unSortedNumbers.length;
		for (int i = 0; i < size; i++) {

			boolean flag = false;
			for (int j = 0; j < size - i - 1; j++) {

				if (unSortedNumbers[j] > unSortedNumbers[j + 1]) {
					int temp = unSortedNumbers[j];
					unSortedNumbers[j] = unSortedNumbers[j + 1];
					unSortedNumbers[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}

		return unSortedNumbers;
	}
}
