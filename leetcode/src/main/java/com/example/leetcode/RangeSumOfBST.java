package com.example.leetcode;

//https://leetcode.com/problems/range-sum-of-bst/

public class RangeSumOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}

		if (root.val > high) {
			return rangeSumBST(root.left, low, high);
		} else if (root.val < low) {
			return rangeSumBST(root.right, low, high);
		}
		return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
	}
	
	public int rangeSumBST2(TreeNode root, int low, int high) {
        int sum =0;
        if(root==null) {
            return 0;
        }

        if(root.val<=high&& root.val>=low) {
            sum = sum + root.val;
        }
        int leftSum = rangeSumBST(root.left, low, high);
        int rightSum = rangeSumBST(root.right, low, high);
        return sum + leftSum + rightSum;
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
