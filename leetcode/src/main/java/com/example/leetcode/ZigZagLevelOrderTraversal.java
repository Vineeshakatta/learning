package com.example.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

public class ZigZagLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		
		if(root==null) {
			return result;
		}
		
		Deque<TreeNode> deque = new LinkedList<TreeNode>();
		deque.add(root);
		boolean reverse = false;
		while(!deque.isEmpty()) {
			int size = deque.size();
			List<Integer> currentLevel = new ArrayList<>(size);
			for(int i=0; i<size;i++) {
				if(!reverse) {
					TreeNode currentNode = deque.pollFirst();
					currentLevel.add(currentNode.val);
					if(currentNode.left!=null) {
						deque.addLast(currentNode.left);
					}
					if(currentNode.right!=null) {
						deque.addLast(currentNode.right);
					}
				} else {
					TreeNode currentNode = deque.pollLast();
					currentLevel.add(currentNode.val);
					if(currentNode.left!=null) {
						deque.addFirst(currentNode.left);
					}
					if(currentNode.right!=null) {
						deque.addFirst(currentNode.right);
					}
				}
			}
			reverse = !reverse;
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
