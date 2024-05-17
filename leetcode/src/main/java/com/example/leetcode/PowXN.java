package com.example.leetcode;

public class PowXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 10;
		PowXN obj = new PowXN();
		System.out.println(obj.myPow(x, n));
	}
	
	public double myPow(double x, int n) {
        double ans =1;
        if(n==0 || x==1) {
            return ans;
        } else if(x==0) {
            return 0;
        }
        long nTemp = n;
        if(n<0) {
            nTemp *= -1;
        }
        while(nTemp>0) {
            if(nTemp%2==0) {
                x = x*x;
                nTemp = nTemp/2;
            } else {
                ans = ans * x;
                nTemp--;
            }
        }
        if(n<0) {
            ans = (double) (1/ans);
        }
        return ans;
    }

}
