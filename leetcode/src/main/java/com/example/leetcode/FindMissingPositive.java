package com.example.leetcode;

//https://leetcode.com/problems/first-missing-positive/

public class FindMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 4, -1, 1 };
		FindMissingPositive obj = new FindMissingPositive();
		System.out.println(obj.firstMissingPositive(nums));

	}

	public int firstMissingPositive(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] > 0 && nums[i] <= nums.length && nums[correct] != nums[i]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else {
				i++;
			}
		}
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				return index + 1;
			}
		}
		return nums.length + 1;
	}

}
