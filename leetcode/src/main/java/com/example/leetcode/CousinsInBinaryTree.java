package com.example.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.com/problems/cousins-in-binary-tree/

public class CousinsInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isCousins(TreeNode root, int x, int y) {
		TreeNode xx = findNode(root, x);
		TreeNode yy = findNode(root, y);
		return (level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy));
	}

	public TreeNode findNode(TreeNode node, int x) {
		if (node == null) {
			return null;
		}
		if (node.val == x) {
			return node;
		}
		TreeNode left = findNode(node.left, x);
		if (left != null) {
			return left;
		}
		return findNode(node.right, x);
	}

	public boolean isSiblings(TreeNode node, TreeNode x, TreeNode y) {
		if (node == null) {
			return false;
		}
		return (node.left == x && node.right == y) || (node.left == y && node.right == x) || isSiblings(node.left, x, y)
				|| isSiblings(node.right, x, y);
	}

	public int level(TreeNode node, TreeNode x, int lev) {
		if (node == null) {
			return 0;
		}
		if (node == x) {
			return lev;
		}
		int left = level(node.left, x, lev + 1);
		if (left != 0) {
			return left;
		}
		return level(node.right, x, lev + 1);
	}
	
	public boolean isCousins2(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        boolean isSameLevel = isSameLevel(root, x, y);
        if(!isSameLevel) {
            return false;
        }
        return isSameLevel && (!isSiblings(root, xx, yy));
    }

    public boolean isSameLevel(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>(size);
            for(int i=0; i<size; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null) {
                    queue.offer(currentNode.right);
                }
            }
            if(currentLevel.contains(x) && currentLevel.contains(y)) {
                return true;
            }
        }
        return false;
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
