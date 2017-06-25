package com.util.algorithm.util;

import java.util.Arrays;

public class AlgorithmUtils {

	private AlgorithmUtils() {
		throw new IllegalAccessError("AlgorithmUtils access error");
	}

	public static int[] trimArray(int[] array, int start, int end) {

		//Recover from negative array exception
		if (start < 0 || end < 0 || (end - start) < 0) {
			throw new IllegalArgumentException("Invalid start/end positions");
		}

		int index = 0;
		int[] result = new int[end - (start - 1)];
		for (int i = start; i <= end; i++) {
			result[index++] = array[i];
		}
		return result;
	}
	
	public static int[] sortedIntArray(int[] array) {
		
		Arrays.sort(array);
		return array;
	}
}
