package com.interview150.leetcode;

import com.interview150.leetcode.RotateList.ListNode;

//https://leetcode.com/problems/partition-list/description/

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode partition(ListNode head, int x) {
		ListNode beforeHead = new ListNode(0);
		ListNode afterHead = new ListNode(0);
		ListNode before = beforeHead;
		ListNode after = afterHead;
		while (head != null) {
			if (head.val < x) {
				before.next = head;
				before = head;
			} else {
				after.next = head;
				after = head;
			}
			head = head.next;
		}
		after.next = null;
		before.next = afterHead.next;
		return beforeHead.next;
	}

	class ListNode {
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
