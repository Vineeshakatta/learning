package com.example.leetcode;

//https://leetcode.com/problems/first-bad-version/description/

public class FirstBadVersion {
	
	static int badVersion = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		FirstBadVersion obj = new FirstBadVersion();
		System.out.println(obj.firstBadVersion(n));
	}
	
	public int firstBadVersion(int n) {
		int s=1;
		int e = n;
		while(s<=e) {
			int mid = s+ (e-s)/2;
			if(!isBadVersion(mid)) {
				s = mid+1;
			} else {
				e = mid-1;
			}
		}
		return s;
	}
	
	
	
	public static boolean isBadVersion(int bad) {
		return bad==badVersion;
	}

}
