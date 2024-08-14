package com.interview150.leetcode;

//https://leetcode.com/problems/container-with-most-water

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		ContainerWithMostWater  obj = new ContainerWithMostWater();
		System.out.println(obj.maxArea(height));

	}
	
	public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right) {
        	int w = right - left;
        	int h = Math.min(height[left], height[right]);
        	int currentArea = w  * h;
        	maxArea = Math.max(maxArea, currentArea);
        	if(height[left]<height[right]) {
        		left++;
        	} else {
        		right--;
        	}
        }
        return maxArea;
	}

}
