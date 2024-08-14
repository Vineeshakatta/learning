package com.interview150.leetcode;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/problems/majority-element/

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		MajorityElement obj = new MajorityElement();
		System.out.println(obj.majorityElement2(nums));

	}
	
	public int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
	
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i])>nums.length/2) {
                return nums[i];
            }
        }
        return 0;
    }

}
