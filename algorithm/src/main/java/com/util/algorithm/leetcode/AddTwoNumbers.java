package com.util.algorithm.leetcode;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

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

		@Override
		public String toString() {
			
			StringBuilder builder = new StringBuilder();
			builder.append(this.val);
			ListNode curr = this.next;
			while(curr != null) {
				builder.append(" -> ");
				builder.append(curr.val);
				curr = curr.next;
			}
			return builder.toString();
		}
	}
	
	public ListNode getNodes(final int[] nodes) {
		
		ListNode headNode = new ListNode(0);
		if(nodes != null && nodes.length > 0) {
			ListNode nodeList = headNode;
			for(int node : nodes) {
				nodeList.next = new ListNode(node);
				nodeList = nodeList.next;
			}
			return headNode.next;
		}
		return null;
	}
	
	public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
		
		ListNode dummyNode = new ListNode(0);
		ListNode node1 = l1;
		ListNode node2 = l2;
		ListNode curnt = dummyNode;
		int carry = 0;
		while(node1 != null || node2 != null) {
			int x = (node1 != null) ? node1.val : 0;
			int y = (node2 != null) ? node2.val : 0;
			int t = x + y + carry;
			carry = t/10;
			curnt.next = new ListNode(t % 10);
			curnt = curnt.next;
			if(node1 != null) {
				node1 = node1.next;
			}
			if(node2 != null) {
				node2 = node2.next;
			}
		}
		if(carry > 0) {
			curnt.next = new ListNode(carry);
		}
		return dummyNode.next;
	}
	
	public static void main(String[] args) {
		
		AddTwoNumbers atn = new AddTwoNumbers();
		ListNode node1 = atn.getNodes(new int[] {2, 4, 3});
		System.out.println(node1);
		ListNode node2 = atn.getNodes(new int[] {5, 6, 4});
		System.out.println(node2);
		ListNode sum = atn.addTwoNumbers(node1, node2);
		System.out.println(sum);
	}

	@Test
	public void testTwoSum1() {
		
		ListNode node1 = getNodes(new int[] {2, 4, 3});
		ListNode node2 = getNodes(new int[] {5, 6, 4});
		assertEquals(addTwoNumbers(node1, node2).toString(), "7 -> 0 -> 8");
	}
	
	@Test
	public void testTwoSum2() {
		
		ListNode node1 = getNodes(new int[] {0, 1});
		ListNode node2 = getNodes(new int[] {0, 1, 2});
		assertEquals(addTwoNumbers(node1, node2).toString(), "0 -> 2 -> 2");
	}
}