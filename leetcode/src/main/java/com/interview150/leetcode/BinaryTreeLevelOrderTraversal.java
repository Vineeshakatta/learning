package com.interview150.leetcode;

//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root==null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> currentLevel = new ArrayList<>(size);
			for(int i=0; i<size; i++) {
				TreeNode currentNode = queue.poll();
				currentLevel.add(currentNode.val);
				if(currentNode.left!=null) {
					queue.offer(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.offer(currentNode.right);
				}
			}
			result.add(currentLevel);
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
