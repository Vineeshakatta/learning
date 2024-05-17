package com.example.leetcode;

//https://leetcode.com/problems/search-in-a-binary-search-tree/description/

public class SearchInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode searchBST(TreeNode root, int target) {
		if(root==null) {
			return null;
		}
		if(target==root.val) {
			return root;
		} else if(root.val>target) {
			return searchBST(root.left, target);
		} else {
			return searchBST(root.right, target);
		}
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
