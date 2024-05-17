package com.example.leetcode;

//https://leetcode.com/problems/sort-an-array/description/

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,3,1};
		SortAnArray obj = new SortAnArray();
		System.out.println(Arrays.toString(obj.sortArray(arr)));

	}
	
	public int[] sortArray(int[] nums) {
		return mergeSort(nums, 0, nums.length-1);
	}
	
	public int[] mergeSort(int[] nums, int start, int end) {
		if(start==end) {
			return new int[] {nums[start]};
		}
		int mid = start + (end - start)/2;
		int[] left = mergeSort(nums, start, mid);
		int[] right = mergeSort(nums, mid+1, end);
		return merge(left , right);
	}
	
	public int[] merge(int[] left, int[] right) {
		int i=0;
		int j=0;
		int k=0;
		int[] numbers = new int[left.length+right.length];
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				numbers[k] = left[i];
				i++;
			} else {
				numbers[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			numbers[k] = left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			numbers[k] = right[j];
			j++;
			k++;
		}
		return numbers;
	}

}
