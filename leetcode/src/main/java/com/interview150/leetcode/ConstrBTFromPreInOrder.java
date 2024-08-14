package com.interview150.leetcode;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

import java.util.Arrays;

public class ConstrBTFromPreInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		ConstrBTFromPreInOrder obj = new ConstrBTFromPreInOrder();
		obj.buildTree(preorder, inorder);
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length==0) {
			return null;
		}
		int root = preorder[0];
		int index = 0;
		for(int i=0; i<inorder.length; i++) {
			if(root == inorder[i]) {
				index = i;
			}
		}
		TreeNode node = new TreeNode(root);
		node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
		node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
		return node;
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
