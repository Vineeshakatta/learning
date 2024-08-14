package com.interview150.leetcode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate-ii

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		ContainsDuplicate2 obj = new ContainsDuplicate2();
		System.out.println(obj.containsNearbyDuplicate(nums, k));

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || nums.length <= 2 || k == 0) {
			return false;
		}

		// declare hashset wthat will hold window
		Set<Integer> window = new HashSet<Integer>();
		// iterate over nums array
		for (int i = 0; i < nums.length; i++) {
			// check if current index is greater than k, if true then on each iteration
			// remove leftmost element from set
			if (i > k)
				window.remove(nums[i - k - 1]);
			// try to add element to our window add method will return false if element
			// already in the set, if it's in the set return true
			if (!window.add(nums[i]))
				return true;
		}
		// return false at the end
		return false;
	}

}
