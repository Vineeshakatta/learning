package com.example.leetcode;

//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
	
	public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] person : accounts) {
            int sum = 0;
            for(int value: person) {
                sum = sum + value;
            }
            if(sum>maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

}
