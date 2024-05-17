package com.example.leetcode;

//https://leetcode.com/problems/valid-perfect-square/description/

public class ValidPerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =12;
		ValidPerfectSquare obj = new ValidPerfectSquare();
		System.out.println(obj.isPerfectSquare(x));
	}
	
	public boolean isPerfectSquare(int num) {
		if(num==0 || num ==1) {
			return true;
		}
		int start =1;
		int end = num;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if((long)mid* mid == (long)num) {
				return true;
			} else if((long)mid * mid < (long)num) {
				start = mid +1;
			} else {
				end = mid -1;
			}
		}
		return false;
	}

}
