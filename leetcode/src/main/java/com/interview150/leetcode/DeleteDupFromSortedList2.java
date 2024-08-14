package com.interview150.leetcode;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

public class DeleteDupFromSortedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        while(head!=null) {
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val) {
                    head = head.next;
                } 
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return temp.next;
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
