package com.interview150.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/longest-consecutive-sequence/

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2};
		LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
		System.out.println(obj.longestConsecutive(nums));

	}

	public int longestConsecutive(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 1;
		int max = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				if (nums[i] == nums[i - 1] + 1) {
					count++;
				} else {
					max = Math.max(count, max);
					count = 1;
				}
			}
		}
		return Math.max(count, max);
	}

}
