package com.interview150.leetcode;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/

public class BTMaxPathSum {

	int ans = Integer.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxPathSum(TreeNode root) {
    	helper(root);
    	return ans;
    }
    
    public int helper(TreeNode node) {
    	if(node==null) {
    		return 0;
    	}
    	
    	int leftSum = helper(node.left);
    	int rightSum = helper(node.right);
    	leftSum = Math.max(0, leftSum);
    	rightSum = Math.max(0, rightSum);
    	int pathSum = node.val + leftSum + rightSum;
    	ans = Math.max(ans, pathSum);
    	return Math.max(leftSum, rightSum) + node.val;    	
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
