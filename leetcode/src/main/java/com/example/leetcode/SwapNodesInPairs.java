package com.example.leetcode;

//https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode swapPairs(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode temp = head.next;
		head.next = swapPairs(head.next.next);
		temp.next = head;
		return temp;
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
