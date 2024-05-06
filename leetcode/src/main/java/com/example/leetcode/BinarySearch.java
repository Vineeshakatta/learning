package com.example.leetcode;

//https://leetcode.com/problems/binary-search/description/

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {};
		int target = 8;
		BinarySearch bs = new BinarySearch();
		System.out.println(bs.search(nums, target));
	}
	
	public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(nums[mid]>target) {
                end = mid - 1;
            } else if(nums[mid]< target) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
