package com.interview150.leetcode;

//https://leetcode.com/problems/trapping-rain-water/description/

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
		TrappingRainWater obj = new TrappingRainWater();
		System.out.println(obj.trap(heights));

	}
	
	public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water =0;
        while(left<right) {
        	if(leftMax<rightMax) {
        		left++;
        		leftMax = Math.max(leftMax, height[left]);
        		water += leftMax - height[left];
        	} else {
        		right--;
        		rightMax = Math.max(rightMax, height[right]);
        		water += rightMax - height[right];
        	}
        }
       	return water;
    }

}
