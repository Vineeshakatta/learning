package com.interview150.leetcode;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   hello world   ";
		ReverseWordsInAString obj = new ReverseWordsInAString();
		System.out.println(obj.reverseWords(s));
	}

	public String reverseWords(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (i <= j && s.charAt(i) == ' ') {
			i++;
		}
		while (j >= i && s.charAt(j) == ' ') {
			j--;
		}
		s = s.substring(i, j + 1);
		String[] str = s.split("\\s+");
		StringBuilder out = new StringBuilder();
		for (int k = str.length - 1; k > 0; k--) {
			out.append(str[k]).append(" ");
		}
		return out.append(str[0]).toString();
	}

}
