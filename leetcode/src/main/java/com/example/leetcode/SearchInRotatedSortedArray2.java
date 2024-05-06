package com.example.leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchInRotatedSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,5,6,6,7,0,1,2};
		int target = 0;
		SearchInRotatedSortedArray2 obj = new SearchInRotatedSortedArray2();
		System.out.println(obj.search(nums, target));		

	}
	
	public boolean search(int[] nums, int target) {
        int start=0; 
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target==nums[mid]) {
                return true;
            }
            if(nums[start]== nums[mid]) {
                start++;
                continue;
            }
            if(nums[start]<nums[mid]) {
                if(nums[start]<=target && nums[mid]>target) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(nums[mid]<target && nums[end]>=target) {
                    start = mid+1;
                } else {
                    end = mid -1;
                }
            }
        }
        return false;
    }

}
