package com.interview150.leetcode;

//https://leetcode.com/problems/is-subsequence

public class IsSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String t = "ahbgdc";
		IsSubSequence obj = new IsSubSequence();
		System.out.println(obj.isSubsequence(s, t));

	}

	public boolean isSubsequence(String s, String t) {
		int sp =0;
        int tp =0;
        while(sp<s.length() && tp<t.length()) {
            if(s.charAt(sp)==t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return sp==s.length();
	}

}
