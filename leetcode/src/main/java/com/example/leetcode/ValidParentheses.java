package com.example.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "()";
		ValidParentheses obj = new ValidParentheses();
		System.out.println(obj.isValid(s));
	}
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : s.toCharArray()) {
			if(ch=='(' || ch=='{' || ch=='[') {
				stack.push(ch);
			} else {
				if (ch == ')') {
                    if(stack.isEmpty() || stack.pop()!= '(')
                        return false;
                } else if(ch=='}') {
                    if(stack.isEmpty() || stack.pop()!= '{')
                        return false;
                } else if(ch == ']') {
                    if(stack.isEmpty() || stack.pop()!= '[')
                        return false;
                }
			}
		}
		return stack.isEmpty();
	}

}
