package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/path-sum-ii/description/

public class PathSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> paths = new ArrayList<>();
		pathSumHelper(root, targetSum, paths, new ArrayList<>());
		return paths;
	}

	public void pathSumHelper(TreeNode root, int targetSum, List<List<Integer>> paths, List<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.val);
		if (root.val == targetSum && root.left == null && root.right == null) {
			paths.add(new ArrayList<>(path));
		} else {
			pathSumHelper(root.left, targetSum - root.val, paths, path);
			pathSumHelper(root.right, targetSum - root.val, paths, path);
		}
		path.remove(path.size() - 1);
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
