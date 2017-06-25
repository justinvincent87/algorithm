package com.util.algorithm.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author shervin
 * 
 *         Given a string, find the length of the longest substring without
 *         repeating characters.
 * 
 *         Examples:
 * 
 *         Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 *         Given "bbbbb", the answer is "b", with the length of 1.
 * 
 *         Given "pwwkew", the answer is "wke", with the length of 3. Note that
 *         the answer must be a substring, "pwke" is a subsequence and not a
 *         substring.
 *
 */
public class LongestSubstring {

	public int lengthOfLongestSubstring1(String s) {

		String res = "";
		int max = 0;
		char[] chars = s.toCharArray();
		for(char c : chars) {
			res += c;
			System.out.println(res);
			if(s.contains(res) && res.length() > max) {
				System.out.print("1");
				max = res.length();
				res = res.substring(1, res.length());
			}else if(res.length()>0) {
				System.out.print("2");
			}
		}
		return max;
	}

	@Test
	public void testTwoSum() {

		/*assertEquals(3, lengthOfLongestSubstring1("abcabcbb"));
		assertEquals(1, lengthOfLongestSubstring1("bbbbbbb"));*/
		assertEquals(3, lengthOfLongestSubstring1("pwwkew"));
		
	}
}