package com.example.leetcode;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

public class PopulatingNextRightPointersInEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node connect(Node root) {
		if (root == null) {
			return root;
		}
		Node leftmost = root;
		while (leftmost.left != null) {
			Node currentNode = leftmost;
			while (currentNode != null) {
				currentNode.left.next = currentNode.right;
				if (currentNode.right != null) {
					currentNode.right.next = currentNode.next.left;
				}
				currentNode = currentNode.next;
			}
			leftmost = leftmost.left;
		}
		return root;
	}

	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	}

}
