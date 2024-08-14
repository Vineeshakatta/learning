package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum/description/

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		CombinationSum obj = new CombinationSum();
		System.out.println(obj.combinationSum(candidates, target));
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		combinations(candidates, target, result, new ArrayList<>(), 0);
		return result;
	}

	public void combinations(int[] candidates, int target, List<List<Integer>> result, List<Integer> templist,
			int start) {
		if (target < 0) {
			return;
		} else if (target == 0) {
			result.add(new ArrayList<>(templist));
		} else {
			for (int i = start; i < candidates.length; i++) {
				templist.add(candidates[i]);
				combinations(candidates, target - candidates[i], result, templist, i); // not i + 1 because we can reuse
																						// same elements
				templist.remove(templist.size() - 1);
			}
		}
	}

}
