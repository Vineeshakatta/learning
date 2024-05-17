package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		FindDisappearedNumbers obj = new FindDisappearedNumbers();
		System.out.println(obj.findDisappearedNumbers(nums));

	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		int i=0;
		int len = nums.length-1;
		while(i<=len) {
			int value = nums[i]-1;
			if(nums[i]!=nums[value]) {
				int temp = nums[i];
				nums[i] = nums[value];
				nums[value] = temp;				
			} else {
				i++;
			}
		}
		for(int index=0; index<=len; index++) {
			if(index!=nums[index]-1) {
				list.add(index+1);
			}
		}
		return list;
	}

}
