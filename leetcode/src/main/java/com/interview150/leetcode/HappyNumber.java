package com.interview150.leetcode;

//https://leetcode.com/problems/happy-number/description/

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		HappyNumber obj = new HappyNumber();
		System.out.println(obj.isHappy(n));

	}
	
	public boolean isHappy(int n) {
		int s = n;
		int f = n;
		do {
            s = findSquare(s);
            f = findSquare(findSquare(f));

        } while(s!=f);
        if(f==1) {
            return true;
        }
		return false;
	}
	
	public int findSquare(int n) {
		int square =0;
		while(n>0) {
			square = square + (n%10) * (n%10);
			n = n/10;
		}
		return square;
	}

}
