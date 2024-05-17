package com.example.leetcode;

//https://leetcode.com/problems/climbing-stairs/description/

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		ClimbingStairs obj = new ClimbingStairs();
		System.out.println(obj.climbStairs2(n));

	}
	
	public int climbStairs(int n) {
		if(n<=3) {
			return n;
		}
		int prev1 = 3;
		int prev2 = 2;
		int curr =0;
		for(int i=3; i<n; i++) {
			curr = prev1 + prev2;
			prev2 = prev1;
			prev1 = curr;
		}
		return curr;
	}
	
	public int climbStairs2(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
