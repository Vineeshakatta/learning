package com.interview150.leetcode;

//https://leetcode.com/problems/length-of-last-word/description/

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   fly me   to   the moon  ";
		LengthOfLastWord obj = new LengthOfLastWord();
		System.out.println(obj.lengthOfLastWord(s));
	}

	public int lengthOfLastWord(String s) {
		int i = s.length()-1;
		while(i>=0 && s.charAt(i)==' ') {
			i--;
		}
		int lastIndex = i;
		while(i>=0 && s.charAt(i)!=' ') {
			i--;
		}
		return lastIndex -i;
	}

}
