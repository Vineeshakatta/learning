package com.example.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/h-index/

public class HIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,0,6,1,5};
		HIndex obj = new HIndex();
		System.out.println(obj.hIndex(nums));

	}
	
	public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int s =0;
        int e = n-1;
        while(s<=e) {
            int mid = s+(e - s)/2;
            if(citations[mid]>=n-mid) {
                e = mid -1;
            } else {
                s = mid+1;
            }
        }
        return n-s;
    }

}
