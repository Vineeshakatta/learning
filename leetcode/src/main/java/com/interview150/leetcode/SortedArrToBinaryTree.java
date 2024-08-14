package com.interview150.leetcode;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

public class SortedArrToBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		SortedArrToBinaryTree obj = new SortedArrToBinaryTree();
		obj.sortedArrayToBST(nums);
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        return populate(nums, 0, nums.length-1);   
    }
	
	public TreeNode populate(int[] nums, int start, int end) {
		if(start>end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = populate(nums, start, mid-1);
		root.right = populate(nums, mid+1, end);
		return root;
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
