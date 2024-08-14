package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/3sum/description/

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,1,2,-1,-4};
		ThreeSum obj = new ThreeSum();
		System.out.println(obj.threeSum(nums));

	}

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length<3  || nums[0]>0) {
			return result;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length-2; i++) {
			if(nums[i]>0) {
				break;
			}
			for(int j=i+1; j<nums.length-1; j++) {
				int required = -1 * (nums[i] + nums[j]);
				if(map.containsKey(required) && map.get(required)>j) {
					result.add(Arrays.asList(nums[i], nums[j], required));
				}
				j = map.get(nums[j]);
			}
			i = map.get(nums[i]);
		}
		return result;
	}

}
