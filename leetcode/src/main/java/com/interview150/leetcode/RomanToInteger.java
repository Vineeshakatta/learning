package com.interview150.leetcode;

//https://leetcode.com/problems/roman-to-integer/description/

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV";
		RomanToInteger obj = new RomanToInteger();
		System.out.println(obj.romanToInt(s));

	}

	public int romanToInt(String s) {
		int num = 0;
		int ans = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;
			case 'L':
				num = 50;
				break;
			case 'C':
				num = 100;
				break;
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;
			}
			if(4*num<ans) {
				ans = ans - num;
			} else {
				ans = ans + num;
			}
		}
		return ans;
	}

}
