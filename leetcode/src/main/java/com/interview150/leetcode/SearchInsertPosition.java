package com.interview150.leetcode;

//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 5;
		SearchInsertPosition obj = new SearchInsertPosition();
		System.out.println(obj.searchInsert(nums, target));		
	}
	
	public int searchInsert(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		if(nums[start]>target) {
			return start;
		} else if(nums[end]<target) {
			return nums.length;
		}
		while(start<end) {
			int mid = start + (end - start)/2;
			if(nums[mid]>target) {
				end = mid;
			} else if(nums[mid]<target) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return start;
	}

}
