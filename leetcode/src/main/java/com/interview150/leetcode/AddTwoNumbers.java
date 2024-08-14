package com.interview150.leetcode;

import com.example.leetcode.AddTwoNumbers.ListNode;

//https://leetcode.com/problems/add-two-numbers/description/

public class AddTwoNumbers {

	int carry = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null && carry == 0) {
			return null;
		}
		int value = carry;
		if (l1 != null) {
			value = value + l1.val;
			l1 = l1.next;
		}

		if (l2 != null) {
			value = value + l2.val;
			l2 = l2.next;
		}

		ListNode node = new ListNode(value % 10);
		carry = value / 10;
		node.next = addTwoNumbers(l1, l2);
		return node;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
