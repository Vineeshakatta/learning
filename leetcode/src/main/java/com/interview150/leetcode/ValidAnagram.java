package com.interview150.leetcode;

//https://leetcode.com/problems/valid-anagram

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "granaam";
		ValidAnagram obj = new ValidAnagram();
		System.out.println(obj.isAnagram(s, t));

	}

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] count = new int[26];

		for (char ch : s.toCharArray()) {
			count[ch - 'a']++;
		}

		for (char ch : t.toCharArray()) {
			count[ch - 'a']--;
		}

		for (int val : count) {
			if (val != 0) {
				return false;
			}
		}
		return true;
	}

}
