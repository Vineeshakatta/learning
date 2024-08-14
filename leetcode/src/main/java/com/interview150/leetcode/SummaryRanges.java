package com.interview150.leetcode;

//https://leetcode.com/problems/summary-ranges/

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 2, 3, 4, 6, 8, 9 };
		SummaryRanges obj = new SummaryRanges();
		System.out.println(obj.summaryRanges(nums));

	}

	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return result;
		}
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < nums.length; i++) {
			if (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
				sb.append(nums[i]).append("->");
				while (i < nums.length - 1 && nums[i] == nums[i + 1] - 1) {
					i++;
				}
				sb.append(nums[i]);
				result.add(sb.toString());
				sb = new StringBuilder("");
			} else {
				result.add(nums[i] + "");
			}
		}
		return result;
	}

}
