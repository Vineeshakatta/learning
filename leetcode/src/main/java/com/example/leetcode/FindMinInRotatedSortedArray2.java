package com.example.leetcode;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

public class FindMinInRotatedSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,2,0,1};
		FindMinInRotatedSortedArray2 obj = new FindMinInRotatedSortedArray2();
		System.out.println(obj.findMin(nums));
	}
	
	public int findMin(int[] nums) {
		int start =0;
        int end = nums.length-1;
        int min = 0;
        while(start<end) {
            int mid = start + (end - start)/2;
            if(nums[start]<nums[end]) {
                return nums[start];
            }
            if(nums[start]==nums[start+1]) {
                start++;
                continue;
            } else if(nums[end]== nums[end-1]) {
                end--;
                continue;
            }
            if(nums[mid]<=nums[end]){
                end = mid;
            } else {
                start = mid+1;
            }
        }
        if(nums[start]<=nums[end]) {
                return nums[start];
        }
		return -1;
	}

}
