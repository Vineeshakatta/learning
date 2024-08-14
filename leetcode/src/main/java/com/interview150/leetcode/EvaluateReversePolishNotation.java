package com.interview150.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/evaluate-reverse-polish-notation/description

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = { "4", "13", "5", "/", "+" };
		EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
		System.out.println(obj.evalRPN(tokens));

	}

	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		int a =0, b=0;
		for (String str : tokens) {
			if(str.equals("+")) {
				a = stack.pop();
				b = stack.pop();
				stack.push(a+b);
			} else if(str.equals("-")) {
				a = stack.pop();
				b = stack.pop();
				stack.push(b-a);
			} else if(str.equals("*")) {
				a = stack.pop();
				b = stack.pop();
				stack.push(a*b);
			} else if(str.equals("/")) {
				a = stack.pop();
				b = stack.pop();
				stack.push(b/a);
			} else {
				stack.push(Integer.parseInt(str));
			}
		}
		return stack.pop();
	}

}
