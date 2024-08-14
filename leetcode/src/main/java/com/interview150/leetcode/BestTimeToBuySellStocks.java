package com.interview150.leetcode;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock

public class BestTimeToBuySellStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7,1,5,3,6,4};
		BestTimeToBuySellStocks obj = new BestTimeToBuySellStocks();
		System.out.println(obj.maxProfit(prices));

	}
	
	public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i]-buy);
            // if(prices[i]<buy) {
            //     buy = prices[i];
            // } else if(profit<prices[i]-buy) {
            //     profit = prices[i]-buy;
            // }
        }
        return profit;
    }

}
