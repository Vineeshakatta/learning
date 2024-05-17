package com.example.leetcode;

//https://leetcode.com/problems/h-index-ii/description/

public class HIndex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = {1,2,100};
		HIndex2 obj = new HIndex2();
		System.out.println(obj.hIndex(citations));
	}
	
	public int hIndex(int[] citations) {
		int n = citations.length;
		int s=0;
		int e = n-1;
		while(s<=e) {
			int mid = s+ (e-s)/2;
			if(citations[mid]>=n-mid) {
				e = mid-1;
			} else {
				s = mid+1;
			}
		}
		return n-s;
	}

}
