package com.interview150.leetcode;

//https://leetcode.com/problems/minimum-window-substring/description

public class MinWindowSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ADOBECODEBANC", t = "ABC";
		MinWindowSubString obj = new MinWindowSubString();
		System.out.println(obj.minWindow(s, t));

	}

	public String minWindow(String s, String t) {
		if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
			return new String();
		}
		int[] map = new int[128];
		int count = t.length();
		int start = 0, end = 0, minLen = Integer.MAX_VALUE;
		int startIndex = 0;
		for (char c : t.toCharArray()) {
			map[c]++;
		}
		char[] chS = s.toCharArray();
		while (end < chS.length) {
			if (map[chS[end++]]-- > 0) {
				count--;
			}
			while (count == 0) {
				if (end - start < minLen) {
					startIndex = start;
					minLen = end - start;
				}
				if (map[chS[start++]]++ == 0) {
					count++;
				}
			}
		}
		return minLen == Integer.MAX_VALUE ? new String() : new String(chS, startIndex, minLen);
	}

}