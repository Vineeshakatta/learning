package com.interview150.leetcode;

//https://leetcode.com/problems/merge-k-sorted-lists/description/

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists == null || lists.length==0) {
			return null;
		}
		return mergeKListsHelper(lists, 0, lists.length-1);
	}

	private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
		if(start == end) {
			return lists[start];
		}
		if(start +1 == end) {
			return merge(lists[start], lists[end]);
		}
		int mid = (start + end)/2;
		ListNode left = mergeKListsHelper(lists, start, mid);
		ListNode right = mergeKListsHelper(lists, mid+1, end);
		return merge(left, right);
	}
	
	

	private ListNode merge(ListNode left, ListNode right) {
		ListNode curr = new ListNode(0);
		ListNode merge = curr;
		while(left!=null && right!=null) {
			if(left.val<right.val) {
				merge.val = left.val;
				left = left.next;
				merge = merge.next;
			} else {
				merge.val = right.val;
				right = right.next;
				merge = merge.next;
			}
		}
		merge.next = left!=null ? left : right;
		return merge.next;
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
