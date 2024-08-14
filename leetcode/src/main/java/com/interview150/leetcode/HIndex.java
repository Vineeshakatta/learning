package com.interview150.leetcode;

//https://leetcode.com/problems/h-index

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 3, 0, 6, 1, 5 };
		HIndex obj = new HIndex();
		System.out.println(obj.hIndex(nums));

	}

	private int hIndex(int[] citations) {
		Arrays.sort(citations);
		int s = 0;
		int n = citations.length;
		int e = n - 1;
		while (s < e) {
			int mid = (s + e) / 2;
			if (citations[mid] >= n - mid) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}

		return n - s;
	}

}
