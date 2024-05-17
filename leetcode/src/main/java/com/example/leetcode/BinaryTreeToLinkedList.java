package com.example.leetcode;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

public class BinaryTreeToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void flatten(TreeNode root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			return;
		}
		TreeNode currentNode = root;
		while(currentNode!=null) {
			if(currentNode.left!=null) {
				TreeNode runner = currentNode.left;
				while(runner.right!=null) {
					runner = runner.right;
				}
				runner.right = currentNode.right;
				currentNode.right = currentNode.right;
				currentNode.left = null;
			}
			currentNode = currentNode.right;
		}
	}
	
	public void flatten2(TreeNode root) {
		if(root==null) {
			return;
		}
		if(root.left==null && root.right==null) {
			return;
		}
		TreeNode currentNode = root;
		while(currentNode!=null) {
            if(currentNode.left!=null) {
			    TreeNode temp = currentNode.left;
			    TreeNode currNodRightPart = currentNode.right;
			    currentNode.right = temp;
			    currentNode.left = null;
			    while(temp.right!=null) {
				    temp = temp.right;
			    }
			    temp.right = currNodRightPart;
            }
			currentNode = currentNode.right;
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
