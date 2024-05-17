package com.example.leetcode;

//https://leetcode.com/problems/linked-list-cycle-ii/

public class LinkedListCycle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		int length =0;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow==fast) {
				length = cycleLength(slow);
				break;
			}
		}
		if(length==0) {
			return null;
		}
		ListNode s = head;
		ListNode f = head;
		
		while(length>0) {
			s = s.next;
			length--;
		}
		while(f!=s) {
			f = f.next;
			s = s.next;
		}
		return s;
	}
	
	public int cycleLength(ListNode slow) {
		ListNode temp = slow;
		int length =0;
		do {
			temp = temp.next;
			length++;
		} while(slow!=temp);
		return length;
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
