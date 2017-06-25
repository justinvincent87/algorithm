package com.util.algorithm.sorting;

import org.apache.commons.lang.StringUtils;

public class TestSort {

	public static void main(String[] args) {
		
		Integer[] unSortedNumbers = {5, 1, 6, 2, 4, 3};
		Sort sort = new BubbleSort();
		System.out.println(StringUtils.join(sort.sort(unSortedNumbers), ", "));

	}

}
