package com.example.leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		System.out.println(obj.search(nums, target));		

	}
	
	public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end) {
        	int mid = start + (end - start)/2;
        	if(nums[mid] == target) {
        		return mid;
        	}
        	if(nums[start]<=nums[mid]) {
        		if(nums[start]<=target && target<nums[mid]) {
        			end = mid-1;
        		} else {
        			start = mid +1;
        		}
        	} else {
        		if(nums[mid]<target && target<=nums[end]) {
        			start = mid+1;
        		} else {
        			end = mid-1;
        		}
        	}
        }
        return -1;
    }

}
