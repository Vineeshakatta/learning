package com.example.leetcode;

//https://leetcode.com/problems/subsets-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		SubSet2 obj = new SubSet2();
		System.out.println(obj.subsetsWithDup(nums));

	}
	
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		backtracking(list, new ArrayList<>(), nums, 0);
		return list;
	}
	
	public void backtracking(List<List<Integer>> list, List<Integer> templist, int[] nums, int start) {
		list.add(new ArrayList<>(templist));
		for(int i=start; i<nums.length; i++) {
			if(i!=start && nums[i]== nums[i-1]) {
				continue;
			}
			templist.add(nums[i]);
			backtracking(list, templist, nums, i+1);
			templist.remove(templist.size()-1);
		}
	}

}
