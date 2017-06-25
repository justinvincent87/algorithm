package com.util.algorithm.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.util.algorithm.util.DataTypeUtils;

public class FindMissingNumberTest {
	
	@Test(expected=IllegalAccessException.class)
	public void createInstanceTest() throws InstantiationException, IllegalAccessException {
		FindMissingNumber.class.newInstance();
	}

	@Test
	public void testFind() {
		int[] data = {4,7,8,9};
		assertArrayEquals(FindMissingNumber.find(data), DataTypeUtils.getIntArray(1,2,3,5,6));
		int[] data1 = {1,2,3,4,7,8,9};
		assertArrayEquals(FindMissingNumber.find(data1), DataTypeUtils.getIntArray(5,6));
	}
}
