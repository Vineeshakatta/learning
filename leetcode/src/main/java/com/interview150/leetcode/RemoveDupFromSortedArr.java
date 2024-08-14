package com.interview150.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDupFromSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		RemoveDupFromSortedArr obj = new RemoveDupFromSortedArr();
		System.out.println(obj.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
        int index =0;
        for(int i=0; i<nums.length; i++) {
            if(i!=0 && nums[i]==nums[i-1]) {
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
