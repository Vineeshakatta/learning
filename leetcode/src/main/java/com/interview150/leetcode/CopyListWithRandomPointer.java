package com.interview150.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/copy-list-with-random-pointer/description/

public class CopyListWithRandomPointer {

	Map<Node, Node> mp = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}

		if (mp.containsKey(head)) {
			return mp.get(head);
		}

		Node temp = new Node(head.val);
		mp.put(head, temp);

		temp.next = copyRandomList(head.next);
		temp.random = copyRandomList(head.random);

		return temp;
	}

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

}
