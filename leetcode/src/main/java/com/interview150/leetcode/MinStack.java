package com.interview150.leetcode;

import java.util.Objects;
import java.util.Stack;

//https://leetcode.com/problems/min-stack/description/

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Stack<Integer> stack = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(!min.isEmpty() && min.peek()>=val) {
            min.push(val);
        } else if(min.isEmpty()) {
            min.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        if(Objects.equals(stack.peek(), min.peek())) {
            min.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }

}
