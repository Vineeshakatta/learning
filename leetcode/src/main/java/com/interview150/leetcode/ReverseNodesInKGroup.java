package com.interview150.leetcode;

//https://leetcode.com/problems/reverse-nodes-in-k-group/

public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1 || head==null) {
            return head;
        }
        ListNode temp = null;
        ListNode prev = null;
        ListNode current = head;
        int count = 0;
        //Move current k steps forward
        while(current!=null && count<k) {
            current = current.next;
            count++;
        }
        // if we have a full group of k nodes, reverse them
        current= head;
        if(count==k) {
            count = 0;
            while(current!=null && count<k) {
                temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
                count++;
            }
        } else {
            prev = head;
        }
        // Recursively reverse the remaining groups
        if(temp != null){
            head.next = reverseKGroup(temp, k);
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
