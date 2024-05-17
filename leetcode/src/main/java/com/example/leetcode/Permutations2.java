package com.example.leetcode;

//https://leetcode.com/problems/permutations-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/permutations-ii/

public class Permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length==0 || nums==null) {
			return result;
		}
		Arrays.sort(nums);
		recursion(nums, result, new ArrayList<>(), new boolean[nums.length]);
		return result;
	}

	private void recursion(int[] nums, List<List<Integer>> result, ArrayList templist, boolean[] visited) {
		if(nums.length == templist.size()) {
			result.add(new ArrayList<>(templist));
			return;
		} else {
			for(int i=0; i<nums.length; i++) {
				if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1])) {
					continue;
				}
				visited[i] = true;
				templist.add(nums[i]);
				recursion(nums, result, templist, visited);
				templist.remove(templist.size()-1);
				visited[i] = false;
			}
		}
	}
}
