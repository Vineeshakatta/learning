package com.example.leetcode;

//https://leetcode.com/problems/subsets

import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		SubSet obj = new SubSet();
		System.out.println(obj.subset(nums));

	}
	
	public List<List<Integer>> subset(int[] nums) {
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num : nums) {
			int n = outer.size();
            for(int i=0; i<n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
		}
		return outer;
	}

}
