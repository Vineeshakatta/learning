package com.example.leetcode;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

public class StepsToReduceNumberToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		StepsToReduceNumberToZero obj = new StepsToReduceNumberToZero();
		System.out.println(obj.stepsToReduceToZero(num, 0));
	}
	
	public int stepsToReduceToZero(int num, int count) {
		if(num==0) {
			return count;
		}
		return num%2==0 ? stepsToReduceToZero(num/2, count+1) : stepsToReduceToZero(num-1, count+1);
	}

}
