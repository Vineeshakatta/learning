package com.example.leetcode;

//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 4, 3, 2, 2};
		FindTheDuplicateNumber obj = new FindTheDuplicateNumber();
		System.out.println(obj.findDuplicate(nums));
	}
	
	public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for(int index=0; index<nums.length; index++) {
            if(index!=nums[index]-1) {
                return nums[index];
            }
        }
        return nums.length;
    }
	
	public int findDuplicate2(int[] nums) {
		Set<Integer> s = new HashSet<>();
		for(int num : nums) {
			if(s.contains(num)) {
				return num;
			} else {
				s.add(num);
			}
		}
		return nums.length;
	}

}
