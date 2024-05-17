package com.example.leetcode;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

import java.util.Stack;

public class MinAddForValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "())";
		MinAddForValidParentheses obj = new MinAddForValidParentheses();
		System.out.println(obj.minAddToMakeValid(s));
	}
	
	public int minAddToMakeValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : s.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			} else {
				if(!stack.isEmpty() && stack.peek()==')') {
					if(stack.peek()==')') {
						stack.pop();
					} else {
						stack.push('(');
					}
				}
			}
		}
		return stack.size();
	}

}
