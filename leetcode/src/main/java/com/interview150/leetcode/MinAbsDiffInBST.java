package com.interview150.leetcode;

//https://leetcode.com/problems/minimum-absolute-difference-in-bst/

public class MinAbsDiffInBST {
	int min = Integer.MAX_VALUE;
	int prev = Integer.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getMinimumDifference(TreeNode root) {
		if (root == null) {
			return min;
		}
		getMinimumDifference(root.left);
		min = Math.min(min, Math.abs(root.val - prev));
		prev = root.val;
		getMinimumDifference(root.right);
		return min;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {

		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
