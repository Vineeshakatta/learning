package com.example.leetcode;

//https://leetcode.com/problems/rotate-string/description/

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde"; 
		String goal = "cdeab";
		RotateString obj = new RotateString();
		System.out.println(obj.rotateString(s, goal));
	}
	
	public boolean rotateString(String s, String goal) {
		if(s.length()!=goal.length()) {
			return false;
		}
		String doubleStr = s + s;
		return doubleStr.contains(goal);
	}

}
