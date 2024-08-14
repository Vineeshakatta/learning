package com.interview150.leetcode;

//https://leetcode.com/problems/product-of-array-except-self/

public class ProductOfArrSelfExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		ProductOfArrSelfExceptSelf obj = new ProductOfArrSelfExceptSelf();
		System.out.println(obj.productExceptSelf(nums));

	}
	
	public int[] productExceptSelf(int[] nums) {
		int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        for(int i=1; i<nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }
        right[nums.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }

}
