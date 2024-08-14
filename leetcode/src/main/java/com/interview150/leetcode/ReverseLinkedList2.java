package com.interview150.leetcode;

//https://leetcode.com/problems/reverse-linked-list-ii/description/

public class ReverseLinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseBetween2(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		
		for(int i=0; i<left-1; i++) {
			prev = prev.next;
		}
		
		ListNode pres = prev.next;
		ListNode nextNode;
		for(int i=0; i<right-left; i++) {
			nextNode = pres.next;
			pres.next = nextNode.next;
			nextNode.next = prev.next;
			prev.next = nextNode;
		}
		return dummy.next;
	}
	
	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(left==right) {
			return head;
		}
		ListNode pres = head;
		ListNode prev = null;
		for(int i=0; i<left-1 && pres!=null;i++) {
			prev = pres;
			pres = pres.next;
		}
		ListNode last = prev;
		ListNode newEnd = pres;
		ListNode next = pres.next;
		for(int i=0; pres!=null && i<right-left+1; i++) {
			pres.next = prev;
			prev = pres;
			pres = next;
			if(next!=null) {
				next = next.next;
			}
		}
		if(last!=null) {
			last.next = prev;
		} else {
			head = prev;
		}
		newEnd.next = pres;
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
			this.val=val;
			this.next=next;
		}
	}

}
