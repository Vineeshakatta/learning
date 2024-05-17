package com.example.leetcode;

//https://leetcode.com/problems/string-to-integer-atoi/description/

public class StringToIntegerAtoI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   -42";
		StringToIntegerAtoI obj = new StringToIntegerAtoI();
		System.out.println(obj.myAtoi(s));
	}
	
	public int myAtoi(String s) {
		s = s.trim();
		if(s.length()==0) {
			return 0;
		}
		int num=0;
		int i=0;
		int sign = 1;
		if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')) {
			if(s.charAt(i)=='-') {
				sign = -1;
			}
			i++;
		}
		while(i<s.length() && s.charAt(i)-'0'>=0 &&s.charAt(i)-'0'<=9) {
			int digit = s.charAt(i) -'0';
			if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10)){
				return sign==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			num = num * 10 + digit;
			i++;
		}
		return num*sign;
	}

}
