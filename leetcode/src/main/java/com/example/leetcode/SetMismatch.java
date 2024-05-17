package com.example.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,4};
		SetMismatch obj = new SetMismatch();
		System.out.println(Arrays.toString(obj.findErrorNums(nums)));
	}
	
	public int[] findErrorNums(int[] nums) {
		int i =0;
		while(i<nums.length) {
			int correct = nums[i]-1;
			if(nums[correct]!=nums[i]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else {
				i++;
			}
		}
		for(int index=0; index<nums.length; index++) {
			if(nums[index]-1!=index) {
				return new int[] {nums[index], index+1};
			}
		}
		return new int[]{-1, -1};
	}

}
