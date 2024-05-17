package com.example.leetcode;

//https://leetcode.com/problems/validate-binary-search-tree/

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidBST(TreeNode root) {
		return helper(root, null, null);
	}

	public boolean helper(TreeNode node, Integer min, Integer max) {
		if (node == null) {
			return true;
		}
		if (min != null && node.val <= min) {
			return false;
		}
		if (max != null && node.val >= max) {
			return false;
		}
		boolean leftNode = helper(node.left, min, node.val);
		boolean rightNode = helper(node.right, node.val, max);
		return leftNode && rightNode;
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
