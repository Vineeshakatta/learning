package com.example.leetcode;

//https://leetcode.com/problems/count-and-say/description/

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		CountAndSay obj = new CountAndSay();
		System.out.println(obj.countAndSay(n));
	}
	
	public String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=2; i<=n; i++) {
			sb = getNextGen(sb);
		}
		return sb.toString();
	}
	
	public StringBuilder getNextGen(StringBuilder currSb) {
		StringBuilder nextSb = new StringBuilder();
		int len = currSb.length();
		int i=0;
		while(i<len) {
			char c = currSb.charAt(i);
			int count = 1;
			i++;
			while(i<len && c == currSb.charAt(i)) {
				count++;
				i++;
			}
			nextSb.append(count).append(c);
		}
		return nextSb;
	}

}
