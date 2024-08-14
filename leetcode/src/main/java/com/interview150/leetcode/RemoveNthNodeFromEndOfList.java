package com.interview150.leetcode;

import com.example.leetcode.RemoveNthNodeFromEndOfList.ListNode;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = head;
		int length = 0;
		while(dummy!=null) {
			dummy = dummy.next;
			length++;
		}
		if(length==0 || (length==1 && n==1)) {
			return null;
		}
		if(length==n) {
			head = head.next;
			return head;
		}
		
		if(length == 2) {
			if(n == 1) {
				head.next = null;
			}
			return head;
		}
		int prevNode = length-1-n;
		ListNode temp = head;
		for(int i=0; i<prevNode; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		return head;
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
