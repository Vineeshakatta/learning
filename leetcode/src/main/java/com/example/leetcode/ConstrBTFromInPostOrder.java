package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/

public class ConstrBTFromInPostOrder {

	int postorderIndex;
    Map<Integer, Integer> inorderIndexUmp;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		ConstrBTFromInPostOrder obj = new ConstrBTFromInPostOrder();
		obj.buildTree(inorder, postorder);
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex = postorder.length - 1;
        inorderIndexUmp = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexUmp.put(inorder[i], i);
        }
        return buildTreeHelper(postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int left, int right) {
        if (left > right)
            return null;
        int rootValue = postorder[postorderIndex--];
        TreeNode root = new TreeNode(rootValue);
        int inorderPivotIndex = inorderIndexUmp.get(rootValue);
        root.right = buildTreeHelper(postorder, inorderPivotIndex + 1, right);
        root.left = buildTreeHelper(postorder, left, inorderPivotIndex - 1);
        return root;
    }
	
	public TreeNode buildTree2(int[] inorder, int[] postorder) {
        if(inorder.length==0) {
			return null;
		}
        int root = postorder[postorder.length-1];
		int index = 0;
		for(int i=0; i<inorder.length; i++) {
			if(root==inorder[i]) {
				index = i;
			}
		}
		
		TreeNode node = new TreeNode(root);
		node.left = buildTree(Arrays.copyOfRange(inorder, 0, index), Arrays.copyOfRange(postorder, 0, index));
		node.right = buildTree(Arrays.copyOfRange(inorder, index+1, inorder.length), Arrays.copyOfRange(postorder, index, postorder.length-1));
		return node;
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
