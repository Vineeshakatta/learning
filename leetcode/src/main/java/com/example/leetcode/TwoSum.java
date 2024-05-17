package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum/submissions/

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 4};
		int target = 6;
		TwoSum obj = new TwoSum();
		System.out.println(Arrays.toString(obj.twoSum(nums, target)));
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<=nums.length-1; i++) {
			int diff = target - nums[i];
			if(hm.containsKey(diff)) {
				return new int[] {hm.get(diff), i};
			}
			hm.put(nums[i], i);			
		}
		return new int[] {-1,-1};
	}

}
