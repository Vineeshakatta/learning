package com.example.leetcode;

import com.example.leetcode.MergeTwoSortedLists.ListNode;

//https://leetcode.com/problems/middle-of-the-linked-list/description/

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public ListNode middleNode(ListNode head) {
		ListNode s = head;
		ListNode f = head;
		while(f!=null && f.next!=null) {
			f = f.next.next;
			s = s.next;
		}
		return s;
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
