package com.example.leetcode;

//https://leetcode.com/problems/missing-number/description/

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,7,0,1};
		MissingNumbers obj = new MissingNumbers();
		System.out.println(obj.missingNumbers(nums));
	}
	
	public int missingNumbers(int[] nums) {
		int i=0;
        while(i<nums.length) {
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]) {
                int temp = nums[correct];
                nums[correct]= nums[i];
                nums[i]=temp;

            } else {
                i++;
            }
        }
        for(int index=0; index<nums.length;index++) {
            if(nums[index]!=index) {
                return index;
            }
        }
        return nums.length;
	}

}
