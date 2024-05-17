package com.example.leetcode;

//https://leetcode.com/problems/diameter-of-binary-tree/

public class DiameterOfBinaryTree {
	
	int diameter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int diameterOfBinaryTree(TreeNode root) {
		diameter(root);
		return diameter-1;
	}
	
	public int diameter(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        diameter = Math.max(diameter, leftHeight+rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
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
