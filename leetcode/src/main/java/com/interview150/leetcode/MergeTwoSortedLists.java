package com.interview150.leetcode;

//https://leetcode.com/problems/merge-two-sorted-lists/description/

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode merge = new ListNode();
		ListNode tail = merge;
		while(list1!=null && list2!=null) {
			if(list1.val<list2.val) {
				tail.next = list1;
				list1 = list1.next;
				tail = tail.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
				tail = tail.next;
			}
		}
		tail.next = list1!=null? list1 : list2;
		tail = tail.next;
		return merge.next;
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
