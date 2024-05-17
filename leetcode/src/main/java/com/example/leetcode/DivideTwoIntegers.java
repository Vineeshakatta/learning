package com.example.leetcode;

//https://leetcode.com/problems/divide-two-integers/description/

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 7;
		int divisor = 3;
		DivideTwoIntegers obj = new DivideTwoIntegers();
		System.out.println(obj.divide(dividend, divisor));

	}
	
	public int divide(int dividend, int divisor) {
		return dividend==Integer.MIN_VALUE  && divisor == -1 ? Integer.MAX_VALUE : (int)(dividend/divisor);
	}

}
