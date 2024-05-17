package com.example.leetcode;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

public class MaxDepthOfBinaryTree {

	int depth =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
		depth(root);
		return depth;
	}
	
	public int depth(TreeNode node) {
		if(node==null) {
			return 0;
		}
		int leftDepth = depth(node.left);
		int rightDepth = depth(node.right);
		depth = Math.max(leftDepth, rightDepth)+1;
		return depth;
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
