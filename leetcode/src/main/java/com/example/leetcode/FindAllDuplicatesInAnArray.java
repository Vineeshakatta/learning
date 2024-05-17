package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		FindAllDuplicatesInAnArray obj = new FindAllDuplicatesInAnArray();
		System.out.println(obj.findDuplicates(nums));
	}

	public List<Integer> findDuplicates(int[] nums) {
		int i = 0;
		while (i < nums.length) {
			int correct = nums[i] - 1;
			if (nums[i] != nums[correct]) {
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			} else {
				i++;
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != index + 1) {
				list.add(nums[index]);
			}
		}
		return list;
	}

}
