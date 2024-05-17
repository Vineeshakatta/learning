package com.example.leetcode;

//https://leetcode.com/problems/repeated-substring-pattern/description/

public class RepeatedSubStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabc";
		RepeatedSubStringPattern obj = new RepeatedSubStringPattern();
		System.out.println(obj.isRepeatedSubString(s));
	}
	
	public boolean repeatedSubstringPattern(String s) {
		String doubleStr = s + s;
		String sub = doubleStr.substring(1, doubleStr.length()-1);
		return sub.contains(s);
	}
	
	public boolean isRepeatedSubString(String s) {
		int len = s.length();
		for(int i=1; i<=len/2; i++) {
			if(len%i==0) {
				String substr = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for(int j=0; j<len/i; j++) {
					sb.append(substr);
				}
				if(sb.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

}
