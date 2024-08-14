package com.interview150.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		LongestCommonPrefix obj = new LongestCommonPrefix();
		System.out.println(obj.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String prefix = strs[0];
		for (int index = 1; index < strs.length; index++) {
			while (strs[index].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

	public String longestCommonPrefix2(String[] strs) {
		StringBuilder sb = new StringBuilder();
		if (strs == null || strs.length == 0) {
			return sb.toString();
		}
		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) != last.charAt(i)) {
				return sb.toString();
			}
			sb.append(first.charAt(i));
		}
		return sb.toString();
	}

}
