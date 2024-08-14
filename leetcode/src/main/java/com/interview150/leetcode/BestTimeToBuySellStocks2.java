package com.interview150.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

public class BestTimeToBuySellStocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		BestTimeToBuySellStocks2 obj = new BestTimeToBuySellStocks2();
		System.out.println(obj.maxProfit(prices));

	}
	
	public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit = profit + (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }

}
