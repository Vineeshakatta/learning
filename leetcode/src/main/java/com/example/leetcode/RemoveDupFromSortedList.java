package com.example.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

public class RemoveDupFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public ListNode deleteDuplicates(ListNode node) {
		if(node==null) {
			return node;
		}
		ListNode head = node;
		while(node.next!=null) {
			if(node.val==node.next.val) {
				node.next = node.next.next;
			} else {				
				node = node.next;
			}
		}
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
