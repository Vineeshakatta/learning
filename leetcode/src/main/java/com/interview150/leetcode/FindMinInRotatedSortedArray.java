package com.interview150.leetcode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		FindMinInRotatedSortedArray obj = new FindMinInRotatedSortedArray();
		System.out.println(obj.findMin(nums));
		
	}
	
	public int findMin(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start + (end - start)/2;
            if(nums[start]<=nums[end]) {
                return nums[start];
            }
            if(nums[start]>nums[mid]) {
                end = mid;
            } else if(nums[mid]>nums[end]){
                start = mid + 1;
            }
        }
        if(nums[start]<=nums[end]) {
            return nums[start];
        }
        return -1;
    }

}
