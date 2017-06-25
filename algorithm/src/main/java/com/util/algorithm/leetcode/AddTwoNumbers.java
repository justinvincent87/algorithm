package com.util.algorithm.leetcode;

/**
 * @author shervin
 * 
 *         You are given two non-empty linked lists representing two
 *         non-negative integers. The digits are stored in reverse order and
 *         each of their nodes contain a single digit. Add the two numbers and
 *         return it as a linked list.
 * 
 *         You may assume the two numbers do not contain any leading zero,
 *         except the number 0 itself.
 * 
 *         Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *
 */
public class AddTwoNumbers {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			this.val = x;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		public int getVal() {
			return val;
		}

		public void setVal(int val) {
			this.val = val;
		}

	}

	/*public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

	}*/

	/*@Test
	public void testTwoSum() {

		assertArrayEquals(new int[] { 0, 1 }, twoSum1(new int[] { 2, 7, 11, 34 }, 9));
		assertArrayEquals(new int[] { 2, 5 }, twoSum1(new int[] { 2, 6, 5, 23, 34, 4 }, 9));
	}*/
}