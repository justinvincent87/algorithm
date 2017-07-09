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
//TODO: Test case not password for String "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel" 
public class LongestPalindrom {

	public String longestPalindrome(String s) {

		if (s == null || s == "") {
			return "";
		}
		if(s.length() == 1) {
			return s;
		}
		int maxLen = 0;
		String ans = null;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String temp = s.substring(i, j);
				if (temp.indexOf(reverse(temp)) > -1) {
					int tempLen = Math.max((j - i), maxLen);
					if (tempLen > maxLen) {
						maxLen = tempLen;
						ans = temp;
					}
				}
			}
		}
		System.out.println(ans);
		return ans;
	}

	private String reverse(String s) {

		int n = s.length(), i = 0, j = n - 1;
		boolean isEven = n % 2 == 0;
		char[] ch = s.toCharArray();
		while (true) {
			if (i + (isEven ? -1 : 0) == j) {
				break;
			}
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
		}
		return new String(ch);
	}

	@Test
	public void testFindMedianSortedArrays() {

		assertEquals("bab", longestPalindrome("babad"));
		assertEquals("bb", longestPalindrome("cbbd"));
		assertEquals("bb", longestPalindrome("bb"));
		assertEquals("ranynar", longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
}