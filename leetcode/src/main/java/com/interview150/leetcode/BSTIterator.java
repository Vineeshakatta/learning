package com.interview150.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/binary-search-tree-iterator/description

public class BSTIterator {

	Stack<TreeNode> st = new Stack<>();

	public BSTIterator(TreeNode root) {
		pushAll(root);
	}

	public int next() {
		TreeNode temp = st.pop();
		pushAll(temp.right); // before return node, first update stack further
		return temp.val;
	}

	public boolean hasNext() {
		return !st.isEmpty();
	}

	public void pushAll(TreeNode node) {
		while (node != null) {
			st.push(node);
			node = node.left;
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
