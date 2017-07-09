package com.util.algorithm.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

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

	public int lengthOfLongestSubstring(final String s) {
		int n = s.length();
		int length = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        for (int j = 0, i = 0; j < n; j++) {
            char currChar = s.charAt(j);
			if (charMap.containsKey(currChar)) {
                i = Math.max(charMap.get(currChar), i);
            }
            length = Math.max(length, j - i + 1);
            charMap.put(currChar, j + 1);
        }
        return length;
    }

	@Test
	public void testTwoSum() {

		assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, lengthOfLongestSubstring("bbbbbbb"));
		assertEquals(3, lengthOfLongestSubstring("pwwkew"));
		assertEquals(6, lengthOfLongestSubstring("characters"));
		
	}
}