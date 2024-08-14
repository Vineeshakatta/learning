package com.interview150.leetcode;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FindIndexOfFirstOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String haystack = "sadbutsad";
		String needle = "sad";
		FindIndexOfFirstOcc obj = new FindIndexOfFirstOcc();
		System.out.println(obj.strStr(haystack, needle));
	}
	
	public int strStr(String haystack, String needle) {
		for(int i=0, j = needle.length(); i<=haystack.length()-needle.length(); i++) {
			if(haystack.substring(i, i+j).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

}
