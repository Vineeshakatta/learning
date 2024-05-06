package com.example.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstAndLastPositionOfElement {
	
	public static void main(String[] args) {
		int[] arr = {-1,0,3,5,9,12};
		int target = 9;
		FirstAndLastPositionOfElement obj = new FirstAndLastPositionOfElement();
		System.out.println(Arrays.toString(obj.searchRange(arr, target)));
	}
	
	public int[] searchRange(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int[] ans = {-1, -1};
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target<nums[mid]) {
                end = mid -1;
            } else if(target>nums[mid]){
                start = mid +1;
            } else {
            	// possible answers
                ans[0] = mid;
                ans[1] = mid;
                // check if mid-1 exists or not
                while(mid!=0 && nums[mid-1]==nums[mid]) {
                	ans[0] = mid-1;
                	mid = mid-1;
                }
                // check if mid+1 exists or not
                while(mid!=nums.length-1 && nums[mid+1]==nums[mid]) {
                    ans[1] = mid+1;
                    mid=mid+1;
                }
                break;
            }
        }
        return ans;
    }

}
