package com.interview150.leetcode;

//https://leetcode.com/problems/maximum-sum-circular-subarray/description/

public class MaximumSumCircularSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, -3, 5 };

		MaximumSubArray obj = new MaximumSubArray();
		System.out.println(obj.maxSubArray(nums));

	}

	public int maxSubarraySumCircular(int[] nums) {
		int currMax = 0;
		int currMin = 0;
		int sum = 0;
		int maxSum = nums[0];
		int minSum = nums[0];
		for (int num : nums) {
			currMax = Math.max(currMax, 0) + num;
			currMin = Math.min(currMin, 0) + num;
			maxSum = Math.max(currMax, maxSum);
			minSum = Math.min(currMin, minSum);
			sum += num;
		}
		return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
	}
}
