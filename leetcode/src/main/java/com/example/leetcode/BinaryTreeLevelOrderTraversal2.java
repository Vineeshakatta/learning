package com.example.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root==null) {
			return result;
		}
		
		Deque<TreeNode> deque = new LinkedList<>();
		deque.add(root);
		while(!deque.isEmpty()) {
			int size = deque.size();
			List<Integer> currentLevel = new ArrayList<>();
			for(int i=0; i<size;i++) {
				TreeNode currentNode = deque.poll();
				currentLevel.add(currentNode.val);
				if(currentNode.left!=null) {
					deque.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					deque.add(currentNode.right);
				}
			}
			result.add(0, currentLevel);
		}
		return result;
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
