package com.example.leetcode;

import java.math.BigInteger;

//https://leetcode.com/problems/super-pow/description/

public class SuperPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int[] b = {1, 0};
		SuperPow obj = new SuperPow();
		System.out.println(obj.superPow(x, b));
	}
	
	public int superPow(int a, int[] b) {
		StringBuilder sb = new StringBuilder();
		for(int val : b) {
			sb.append(String.valueOf(val));
		}
		
		String f = sb.toString();
		BigInteger exponent = new BigInteger(f);
		BigInteger base = BigInteger.valueOf(a);
		BigInteger result = base.modPow(exponent, BigInteger.valueOf(1337));
		return result.intValue();
	}

}
