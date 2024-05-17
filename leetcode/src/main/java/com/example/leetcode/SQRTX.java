package com.example.leetcode;

//https://leetcode.com/problems/sqrtx

public class SQRTX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		SQRTX obj = new SQRTX();
		System.out.println(obj.mySqrt(x));
	}
	
	public int mySqrt(int x) {
		if(x==0 || x==1) {
			return x;
		}
		int start = 1;
		int end = x;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if((long)(mid*mid)== (long)(x)) {
				return mid;
			} else if((long)(mid*mid)> (long)x) {
				end = mid -1;				
			} else {
				start = mid+1;
			}
		}
		return end;
	}

}
