package com.interview150.leetcode;

//https://leetcode.com/problems/simplify-path/description/

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/.../a/../b/c/../d/./";
		SimplifyPath obj = new SimplifyPath();
		System.out.println(obj.simplifyPath(path));

	}

	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		if (path == null || path.length() == 0) {
			return "/";
		}
		String[] strArr = path.split("/");
		for (String str : strArr) {
			if (str.equals(".") || str.equals("") || (stack.isEmpty() && str.equals(".."))) {
				// do nothing
			} else if (!stack.isEmpty() && str.equals("..")) {
				stack.pop();
			} else {
				stack.push(str);
			}
		}

		if (stack.isEmpty()) {
			return "/";
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.insert(0, stack.pop()).insert(0, "/");
		}
		return sb.toString();
	}

}
