package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

public class TwoSum2SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,4};
		int target = 6;
		TwoSum2SortedArray obj = new TwoSum2SortedArray();
		System.out.println(Arrays.toString(obj.twoSum(nums, target)));
	}
	
	public int[] twoSum(int[] numbers, int target) {
		int start =0;
		int end = numbers.length-1;
		while(start<=end) {
			if(numbers[start]+numbers[end]<target) {
				start++;
			} else if(numbers[start] + numbers[end]> target) {
				end--;
			} else {
				return new int[] {start+1, end+1};
			}
		}
		return new int[]{};
	}
	
	public int[] twoSum2(int[] numbers, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<=numbers.length-1; i++) {
			int diff = target - numbers[i];
			if(hm.containsKey(diff)) {
				return new int[] { hm.get(diff)+1, i+1 };
			} else {
				hm.put(numbers[i], i);
			}
		}
		return new int[] {};
	}
	

}
