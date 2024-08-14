package com.interview150.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/basic-calculator/description/

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(1+(4+5+2)-3)+(6+8)";
		BasicCalculator obj = new BasicCalculator();
		obj.calculate(s);

	}
	
	public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int sign =1;
        int result = 0;
        int num = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                num  = (num * 10) + (c-'0');
            } else if(c=='+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if(c=='-') {
                result += sign * num;
                num =0;
                sign =-1;
            } else if(c=='(') {
                //we push the result first, then sign;
                stack.push(result);
                stack.push(sign);
                //reset the sign and result for the value in the parenthesis
                sign = 1;
                result = 0;
            } else if(c==')') {
                result += sign * num;
                num =0;
                result *= stack.pop(); //stack.pop() is the sign before the parenthesis
                result += stack.pop(); //stack.pop() now is the result calculated before the parenthesis
            }
        }
        if(num!=0) {
            result += sign * num;
        }
        return result;
    }

}
