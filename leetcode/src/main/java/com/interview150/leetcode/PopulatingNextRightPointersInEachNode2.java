package com.interview150.leetcode;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/

public class PopulatingNextRightPointersInEachNode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        // the curNode as the linkedlist of each level
        Node curNode = root;
        while (curNode != null) {
            // a dummyNode to travesal current Level
            Node dummyNode = new Node(0);

            // the prev Node of next level
            Node prevNode = dummyNode;
            while (curNode != null) {
                if (curNode.left != null) {
                    // linked the left child
                    prevNode.next = curNode.left;
                    // update prev as LinkedList
                    prevNode = curNode.left;
                }

                if (curNode.right != null) {
                    prevNode.next = curNode.right;
                    prevNode = curNode.right;
                }

                // the next node of current level
                curNode = curNode.next;
            }

            // after process the next level, process 
            curNode = dummyNode.next;
        }

        return root;
    }
	
	public Node connect2(Node root) {
        if(root==null) {
			return root;
		}
		Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i=0; i<size; i++) {
                Node currentNode = queue.poll();
                if(i==size-1) {
                    currentNode.next = null;
                } else {
                    currentNode.next = queue.peek();
                }
                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }
            }
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
