package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/generate-parentheses/description/

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		GenerateParentheses obj = new GenerateParentheses();
		System.out.println(obj.generateParenthesis(n));

	}

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		backtrack(result, "", 0, 0, n);
		return result;
	}

	public void backtrack(List<String> result, String str, int open, int close, int max) {
		if (str.length() == max * 2) {
			result.add(str);
			return;
		} else {
			if (open < max) {
				backtrack(result, str + "(", open + 1, close, max);
			}
			if (close < open) {
				backtrack(result, str + ")", open, close + 1, max);
			}
		}
	}

}
