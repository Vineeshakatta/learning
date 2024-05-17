package com.example.leetcode;

//https://leetcode.com/problems/fibonacci-number/description/

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		FibonacciSeries obj = new FibonacciSeries();
		System.out.println(obj.fib(n));
		System.out.println(obj.fibonacciSeries(n));
	}
	public int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-2) + fib(n-1);
	}
	
	public int fibonacciSeries(int n) {
        if(n==1 || n==0) {
            return n;
        }
        int x1 = 0;
        int x2 = 1;
        while(n>=2) {
            int temp = x1 + x2;
            x1 = x2;
            x2 = temp; 
            n--;
        }
        return x2;
    }

}
