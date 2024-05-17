package com.example.leetcode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
	
public class LowestCommonAncestorOfBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) {
			return null;
		}
		if(root==p || root==q){
			return root;
		}
		TreeNode leftDepth = lowestCommonAncestor(root.left, p, q);
		TreeNode rightDepth = lowestCommonAncestor(root.right, p, q);
		if(leftDepth!=null && rightDepth!=null) {
			return root;
		}
		return leftDepth==null? rightDepth : leftDepth;
		
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
