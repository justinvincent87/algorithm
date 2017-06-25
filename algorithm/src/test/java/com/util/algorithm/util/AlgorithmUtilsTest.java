package com.util.algorithm.util;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AlgorithmUtilsTest {
	
	@Test(expected=IllegalAccessException.class)
	public void algorithmUtils() throws InstantiationException, IllegalAccessException {
		AlgorithmUtils.class.newInstance();
	}
	
	@Test
	public void testTrimArray() {

		int[] data = { 5, 6, 9, 13, 34, 67 };
		assertArrayEquals(AlgorithmUtils.trimArray(data, 0, 5), data);
		assertArrayEquals(AlgorithmUtils.trimArray(data, 1, 3), DataTypeUtils.getIntArray(6, 9, 13));
		assertArrayEquals(AlgorithmUtils.trimArray(data, 4, 5), DataTypeUtils.getIntArray(34, 67));
		assertArrayEquals(AlgorithmUtils.trimArray(data, 5, 5), DataTypeUtils.getIntArray(67));
		assertArrayEquals(AlgorithmUtils.trimArray(data, 0, 0), DataTypeUtils.getIntArray(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void trimArray1() {
		
		int[] data = { 5, 6, 9, 13, 34, 67 };
		AlgorithmUtils.trimArray(data, 5, 1);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void trimArray2() {
		
		int[] data = { 5, 6, 9, 13, 34, 67 };
		AlgorithmUtils.trimArray(data, 55, 100);
	}
	
	@Test(expected = NullPointerException.class)
	public void trimArray3() {
		AlgorithmUtils.trimArray(null, 1, 1);
	}
}
