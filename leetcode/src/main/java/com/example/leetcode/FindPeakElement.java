package com.example.leetcode;

//https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		FindPeakElement obj = new FindPeakElement();
		System.out.println(obj.findPeakElement(nums));
	}
	
	public int findPeakElement(int[] nums) {
		int start =0;
		int end = nums.length-1;
        
		while(start<=end) {
			int mid = start + (end - start) /2;
            if(start==end) {
                return start;
            }
			if(mid!=end && mid!=0 && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
				return mid;
			} else if(nums[mid]<nums[mid+1]) {
				start = mid+1;
			} else {
				end = mid;
			}
		}
		return start;
	}

}
