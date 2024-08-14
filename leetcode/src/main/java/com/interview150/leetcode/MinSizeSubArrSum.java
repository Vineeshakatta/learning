package com.interview150.leetcode;

//https://leetcode.com/problems/minimum-size-subarray-sum

public class MinSizeSubArrSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int target = 7;
		MinSizeSubArrSum obj = new MinSizeSubArrSum();
		System.out.println(obj.minSubArrayLen(target, nums));

	}

	public int minSubArrayLen(int target, int[] nums) {
		int i = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < nums.length; j++) {
			sum = sum + nums[j];
			while (sum >= target) {
				min = Math.min(min, j - i + 1);
				sum = sum - nums[i];
				i++;
			}
		}
		if (min == Integer.MAX_VALUE) {
			return 0;
		}
		return min;
	}

}
