package com.example.leetcode;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/

public class CountOddNumInInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 3;
		int high = 7;
		System.out.println(countOdds(low, high));
	}

	private static int countOdds(int low, int high) {
		
		return low%2!=0 || high%2!=0 ? ((high-low)/2)+1 : (high-low)/2;
	}
	
	

}
