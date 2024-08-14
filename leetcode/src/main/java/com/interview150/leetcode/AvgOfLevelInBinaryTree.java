package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

public class AvgOfLevelInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		if(root==null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			double avg = 0;
			for(int i=0; i<size;i++) {
				TreeNode currentNode = queue.poll();
				avg = avg + currentNode.val;
				if(currentNode.left!=null) {
					queue.offer(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.offer(currentNode.right);
				}
			}
			avg = avg/size;
			result.add(avg);
		}
		return result;
	}
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {

		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
