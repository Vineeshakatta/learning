package com.example.leetcode;

//https://leetcode.com/problems/find-in-mountain-array

public class FindInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,3,1};
		FindInMountainArray obj = new FindInMountainArray();
		
		int peakElement = obj.peakElement(nums);
		int target = 3;
		int indexFound = obj.indexFound(nums, target, 0, peakElement, true);
		if(indexFound==-1) {
			indexFound = obj.indexFound(nums, target, peakElement+1, nums.length-1, false);
		}
		System.out.println(indexFound);
	}
	
	public int indexFound(int[] nums, int target, int start, int end, boolean isAssending) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(nums[mid]==target) {
				return mid;
			}
			if(isAssending) {
				if(nums[mid]<target) {
					start = mid +1;
				} else {
					end = mid -1;
				}
			} else {
				if(nums[mid]<target) {
					end = mid -1;
				} else {
					start = mid +1;
				}
			}
		}
		return -1;
	}
	
	public int peakElement(int[] nums) {
		int start = 0;
		int end = nums.length-1;
		while(start<end) {
			int mid = start + (end - start)/2;
			if(nums[mid]>nums[mid+1]) {
				end = mid;
			} else {
				start = mid +1;
			}
		}
		return start;
	}
}
