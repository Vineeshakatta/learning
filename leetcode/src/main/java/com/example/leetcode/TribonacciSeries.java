package com.example.leetcode;

//https://leetcode.com/problems/n-th-tribonacci-number/description/

public class TribonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =25;
		TribonacciSeries obj = new TribonacciSeries();
		System.out.println(obj.tribonacciSeries(n));
	}
	
	public int tribonacciSeries(int n) {
		if(n==0 || n==1) {
			return n;
		} else if(n==2) {
			return 1;
		}
		int x1 = 0;
		int x2 = 1;
		int x3 = 1;
		while(n>=3) {
			int temp = x1+x2+x3;
			x1 = x2;
			x2 = x3;
			x3 = temp;
			n--;
		}
		return x3;		
	}

}
