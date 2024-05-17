package com.example.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

public class SerializeDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String serialize(TreeNode root) {
		if(root==null) {
			return "#";
		}
		return root.val + "," + serialize(root.left) + "," + serialize(root.right);
	}
	
	public TreeNode derialize(String data) {
		Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
		return helper(queue);
	}
	
	public TreeNode helper(Queue<String> queue) {
		String s = queue.poll();
		if(s.equals("#")) {
			return null;
		}
		
		TreeNode node = new TreeNode(Integer.valueOf(s));
		node.left = helper(queue);
		node.right = helper(queue);
		return node;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
