package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/palindrome-linked-list/

public class PalindromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPalindrome(ListNode head) {
		ListNode mid = midNode(head);
		ListNode secondhead = reverseList(mid);
		ListNode rereverseHead = secondhead;
		while(head!=null && secondhead!=null) {
			if(head.val!=secondhead.val) {
				break;
			}
			head = head.next;
			secondhead = secondhead.next;
		}
		reverseList(rereverseHead);
		return head==null || secondhead==null;
	}
	
	/*
	 * Every Linked List Problem, if you can't do it in LinkedList format, copy the
	 * data in list and now your question would become for an array, solve it.
	 */

	public boolean isPalindrome2(ListNode head) {
		List<Integer> list = new ArrayList<>();
		ListNode node = head;
		while(node!=null) {
			list.add(node.val);
			node = node.next;
		}
		int left = 0;
		int right = list.size()-1;
		while(left<right && list.get(left)==list.get(right)) {
			left++;
			right--;
		}
		return left>=right;
	}
	
	public ListNode reverseList(ListNode mid) {
		ListNode prev = null;
		ListNode present = mid;
		ListNode next = present.next;
		while(present!=null) {
			present.next = prev;
			prev = present;
			present = next;
			if(next!=null) {				
				next = next.next;
			}
		}
		return prev;
	}
	
	public ListNode midNode(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode s = head;
		ListNode f = head;
		while(f!=null&& f.next!=null) {
			s = s.next;
			f = f.next.next;
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
