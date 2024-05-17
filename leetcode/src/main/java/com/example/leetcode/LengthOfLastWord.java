package com.example.leetcode;

//https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "   fly me   to   the moon  ";
		LengthOfLastWord obj = new LengthOfLastWord();
		System.out.println(obj.lengthOfLastWord(str));
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
