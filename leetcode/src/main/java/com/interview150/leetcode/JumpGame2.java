package com.interview150.leetcode;

//https://leetcode.com/problems/jump-game-ii/description

public class JumpGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 1, 4 };
		JumpGame obj = new JumpGame();
		System.out.println(obj.canJump(nums));
	}
	
	public int canJump(int[] nums) {
		int jumps = 0;
        int currEnd =0;
        int currFarthest =0;
		for (int i = 0; i < nums.length-1; i++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
			if (i == currEnd) {
				currEnd = currFarthest;
				jumps++;
			}
		}
		return jumps;
	}

}
