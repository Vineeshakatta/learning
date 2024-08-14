package com.interview150.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class RemoveDupFromSortedArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,1,2,3,3};
		RemoveDupFromSortedArr2 obj = new RemoveDupFromSortedArr2();
		System.out.println(obj.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
        int index =0;
        for(int i=0; i<nums.length; i++) {
            if(i>=2 && nums[i]==nums[index-2]) {
                continue;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

}
