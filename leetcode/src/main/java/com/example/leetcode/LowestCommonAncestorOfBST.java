package com.example.leetcode;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

public class LowestCommonAncestorOfBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null) {
			return null;
		}
		if(p.val<root.val && q.val<root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if(p.val>root.val && q.val> root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
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
