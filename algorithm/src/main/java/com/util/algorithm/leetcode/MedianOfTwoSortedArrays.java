package com.util.algorithm.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author shervin
 * 
 *         There are two sorted arrays nums1 and nums2 of size m and n
 *         respectively.
 * 
 *         Find the median of the two sorted arrays. The overall run time
 *         complexity should be O(log (m+n)).
 * 
 * 
 */
public class MedianOfTwoSortedArrays {

	public Double findMedianSortedArrays(final int[] nums1, final int[] nums2) {

		int[] arr1 = (nums1 == null) ? new int[0] : nums1;
		int[] arr2 = (nums2 == null) ? new int[0] : nums2;
		int l1 = arr1.length;
		int l2 = arr2.length;
		int[] arrUnion = new int[l1 + l2];
		int i = 0, j = 0, index = 0;
		boolean lnr1 = true;
		boolean lnr2 = true;
		while (lnr1 || lnr2) {
			lnr1 = (i < l1);
			lnr2 = (j < l2);
			Integer x = (!lnr1) ? null : arr1[i];
			Integer y = (!lnr2) ? null : arr2[j];
			if (x != null && y != null) {
				if (x > y) {
					arrUnion[index++] = y;
					j++;
				} else {
					arrUnion[index++] = x;
					i++;
				}
			} else if (x == null && y != null) {
				arrUnion[index++] = y;
				j++;
			} else if (x != null && y == null) {
				arrUnion[index++] = x;
				i++;
			} else {
				break;
			}
		}
		int length = arrUnion.length;
		if (length > 0) {
			if (length % 2 == 0) {
				int ms = length / 2;
				int sum = arrUnion[ms - 1] + arrUnion[ms];
				return (double) sum / 2.0d;
			} else {
				int ms = length / 2;
				return (double) arrUnion[ms];
			}
		}
		return 0.0d;
	}

	@Test
	public void testFindMedianSortedArrays() {

		assertEquals(new Double(2.0), findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }));
		assertEquals(new Double(2.5), findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 }));
	}
}