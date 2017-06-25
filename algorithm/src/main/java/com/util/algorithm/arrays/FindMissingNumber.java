package com.util.algorithm.arrays;

import com.util.algorithm.util.AlgorithmUtils;

public class FindMissingNumber {

	private FindMissingNumber() {
		throw new IllegalAccessError("FindMissingNumber access error");
	}
	
	public static int[] find(int[] numbers) {
		
		int[] values = new int[numbers[numbers.length-1]];
		int index = 0;
		
		//Check if array not start with 1
		if(numbers[0] != 1) {
			for(int i=1;i<numbers[0];i++) {
				values[index++] = i;
			}
		}
		
		for(int i=0;i<numbers.length-1;i++) {
			int nextPos = i+1;
			int difference = numbers[nextPos] - numbers[i];
			if(difference > 1) {
				for(int j=1;j< difference;j++) {
					values[index++] = numbers[i] + j;
				}
			}
		}
		return AlgorithmUtils.trimArray(values, 0, index-1);
	}
}
