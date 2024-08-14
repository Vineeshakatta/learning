package com.interview150.leetcode;

//https://leetcode.com/problems/remove-element/description

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 2, 3};
		RemoveElement obj = new RemoveElement();
		System.out.println(obj.removeElement(nums, 3));
	}
	
	public int removeElement(int[] nums, int val) {
		int index = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;
	}
	
	

}
