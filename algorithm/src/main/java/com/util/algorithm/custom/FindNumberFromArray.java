package com.util.algorithm.custom;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindNumberFromArray {

	static int[] numbers;
	static int n = 1000000;
	static {
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = i + 3;
		}
		numbers = num;
	}

	public Integer findNumberPosition1(Integer target) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public Integer findNumberPosition2(Integer target) {

		int mid = 0;
		int low = 0;
		int high = n;
		while (low <= high) {
			mid = (low + high) / 2;
			if (target < numbers[mid]) {
				high = mid - 1;
			} else if (target > numbers[mid]) {
				low = mid + 1;
			} else {
				break;
			}
		}
		return mid;
	}
	
	@Test
	public void testFindNumberPosition1() {
		assertEquals(new Integer(8800), findNumberPosition1(8803));
		assertEquals(new Integer(97800), findNumberPosition1(97803));
		assertEquals(new Integer(997800), findNumberPosition1(997803));
	}
	
	@Test
	public void testFindNumberPosition2() {
		assertEquals(new Integer(8800), findNumberPosition2(8803));
		assertEquals(new Integer(97800), findNumberPosition2(97803));
		assertEquals(new Integer(997800), findNumberPosition2(997803));
	}
}
