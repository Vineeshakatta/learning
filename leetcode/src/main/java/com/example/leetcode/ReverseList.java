package com.example.leetcode;

//https://leetcode.com/problems/reverse-linked-list/description/

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode prev = null;
		ListNode present = head;
		ListNode next = head.next;
		while(present!=null) {
			present.next = prev;
			prev = present;
			present = next;
			if(present.next!=null) {
				present.next = present.next.next;
			}
		}
		return prev;
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
			this.val=val;
			this.next=next;
		}
	}

}
