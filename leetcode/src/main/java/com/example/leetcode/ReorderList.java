package com.example.leetcode;

//https://leetcode.com/problems/reorder-list/description/

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reorderList(ListNode head) {
		if(head==null) {
			return;
		}
		ListNode mid = findMid(head);
		ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
	}
	
	public ListNode findMid(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast!=null && fast.next!=null) {
			slow= slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public ListNode reverseList(ListNode mid) {
		if(mid==null) {
			return mid;
		}
		ListNode prev = null;
		ListNode pres = mid;
		ListNode nextNode = pres.next;
		while(pres!=null) {
			pres.next = prev;
			prev = pres;
			pres = nextNode;
			if(nextNode!=null) {
				nextNode = nextNode.next;
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
