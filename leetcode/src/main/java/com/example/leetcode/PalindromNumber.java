package com.example.leetcode;

//https://leetcode.com/problems/palindrome-number/description/

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -121;
		PalindromNumber obj = new PalindromNumber();
		System.out.println(obj.isPalindrome(x));

	}
	
	public boolean isPalindrome(int x) {
		if(x<0 || (x!=0 && x%10==0)) {
			return false;
		}
		int ans = 0;
		int initialX = x;
		while(x>0) {
			ans = ans *10 + x%10;
			x = x/10;
		}
		return initialX==ans;
	}

}
