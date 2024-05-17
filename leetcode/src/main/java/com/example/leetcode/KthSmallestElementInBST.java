package com.example.leetcode;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

public class KthSmallestElementInBST {

	int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int kthSmallest(TreeNode root, int k) {
    	if(root==null) {
    		return 0;
    	}
    	int left = kthSmallest(root.left, k);
    	if(left!=0) {
    		return left;
    	}
    	count++;
    	if(k==count) {
    		return root.val;
    	}
    	return kthSmallest(root.right, k);
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
