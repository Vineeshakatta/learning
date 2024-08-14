package com.interview150.leetcode;

//https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		MaximumSubArray obj = new MaximumSubArray();
		System.out.println(obj.maxSubArray(nums));

	}

	public int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			currentSum += nums[i];
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		return maxSum;
	}

}
