package com.interview150.leetcode;

//https://leetcode.com/problems/jump-game/description

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 1, 4 };
		JumpGame obj = new JumpGame();
		System.out.println(obj.canJump2(nums));

	}

	public boolean canJump2(int[] nums) {
		int goal = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= goal) {
				goal = i;
			}
		}
		return goal == 0;
	}

	public boolean canJump(int[] nums) {
		int reachable = 0; // Initilize variable reach as 0, to store reach of the highest index.
		for (int i = 0; i < nums.length; i++) { // Iterate the nums and check if reach is smaller than i then return
												// false else overwrite reach with max of reach and i+nums[i].
			if (reachable < i) {
				return false;
			}
			reachable = Math.max(reachable, i + nums[i]);
		}
		return true; // return true, beacause we reach the last value of the array nums.
	}

}
