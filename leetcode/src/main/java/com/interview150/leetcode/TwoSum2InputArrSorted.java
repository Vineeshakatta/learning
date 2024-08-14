package com.interview150.leetcode;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description

public class TwoSum2InputArrSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		TwoSum2InputArrSorted obj = new TwoSum2InputArrSorted();
		System.out.println(obj.twoSum(numbers, target));

	}

	public int[] twoSum(int[] numbers, int target) {
		int i=0;
		int j = numbers.length-1;
		while(i<j) {
			if(numbers[i] + numbers[j]>target) {
				j--;
			} else if(numbers[i] + numbers[j]<target) {
				i++;
			} else {
				return new int[]{numbers[i], numbers[j]};
			}
		}
		return new int[]{-1, -1};
	}

}
