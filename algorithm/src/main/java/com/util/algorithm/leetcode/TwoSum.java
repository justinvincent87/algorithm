package com.util.algorithm.leetcode;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * @author shervin
 * 
 *         Given an array of integers, return indices of the two numbers such
 *         that they add up to a specific target. You may assume that each input
 *         would have exactly one solution, and you may not use the same element
 *         twice.
 * 
 *         Example: Given nums = [2, 7, 11, 15], target = 9, Because nums[0] +
 *         nums[1] = 2 + 7 = 9, return [0, 1].
 *
 */
public class TwoSum {

	public int[] twoSum1(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public int[] twoSum2(int[] nums, int target) {
		
		Map<Integer, Integer> mapNums = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			mapNums.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (mapNums.containsKey(diff) && mapNums.get(diff) != i) {
				return new int[] { i, mapNums.get(diff) };
			}
		}
		return null;
	}
	
	public int[] twoSum3(int[] nums, int target) {

		Map<Integer, Integer> mapNums = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (mapNums.containsKey(diff)) {
				return new int[] { mapNums.get(diff), i };
			}
			mapNums.put(nums[i], i);
		}
		return null;
	}

	@Test
	public void testTwoSum() {

		assertArrayEquals(new int[] { 0, 1 }, twoSum1(new int[] { 2, 7, 11, 34 }, 9));
		assertArrayEquals(new int[] { 2, 5 }, twoSum1(new int[] { 2, 6, 5, 23, 34, 4 }, 9));
		assertArrayEquals(new int[] { 1, 3 }, twoSum1(new int[] { 2, 1, 11, 34 }, 35));
		assertArrayEquals(new int[] { 1, 2 }, twoSum1(new int[] { 2, 7, 11, 34 }, 18));
		assertArrayEquals(new int[] { 1, 2 }, twoSum1(new int[] { 3, 2, 4 }, 6));

		assertArrayEquals(new int[] { 0, 1 }, twoSum2(new int[] { 2, 7, 11, 34 }, 9));
		assertArrayEquals(new int[] { 2, 5 }, twoSum2(new int[] { 2, 6, 5, 23, 34, 4 }, 9));
		assertArrayEquals(new int[] { 1, 3 }, twoSum2(new int[] { 2, 1, 11, 34 }, 35));
		assertArrayEquals(new int[] { 1, 2 }, twoSum2(new int[] { 2, 7, 11, 34 }, 18));
		assertArrayEquals(new int[] { 1, 2 }, twoSum2(new int[] { 3, 2, 4 }, 6));
		
		assertArrayEquals(new int[] { 0, 1 }, twoSum3(new int[] { 2, 7, 11, 34 }, 9));
		assertArrayEquals(new int[] { 2, 5 }, twoSum3(new int[] { 2, 6, 5, 23, 34, 4 }, 9));
		assertArrayEquals(new int[] { 1, 3 }, twoSum3(new int[] { 2, 1, 11, 34 }, 35));
		assertArrayEquals(new int[] { 1, 2 }, twoSum3(new int[] { 2, 7, 11, 34 }, 18));
		assertArrayEquals(new int[] { 1, 2 }, twoSum3(new int[] { 3, 2, 4 }, 6));
		assertArrayEquals(new int[] { 1, 3 }, twoSum3(new int[] { 1,2,3,4,5,6 }, 6));
	}
}