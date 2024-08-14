package com.interview150.leetcode;

//https://leetcode.com/problems/count-complete-tree-nodes/

public class CountCompleteTreeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = countNodes(root.left);
		int right = countNodes(root.right);
		return left + right + 1;
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