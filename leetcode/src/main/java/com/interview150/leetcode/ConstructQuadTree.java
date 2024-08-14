package com.interview150.leetcode;

//https://leetcode.com/problems/construct-quad-tree/description/

public class ConstructQuadTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 0, 0, 0, 0 } };
		ConstructQuadTree obj = new ConstructQuadTree();
		System.out.println(obj.construct(grid));

	}

	public Node construct(int[][] grid) {
		int n = grid.length;
		return helper(grid, 0, n - 1, 0, n - 1);
	}

	public Node helper(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd) {
		if (rowStart > rowEnd || colStart > colEnd) {
			return null;
		}
		if (hasAllSameValues(grid, rowStart, rowEnd, colStart, colEnd)) {
			return new Node(grid[rowStart][colStart] == 1 ? true : false, true);
		} else {
			int rowMid = (rowStart + rowEnd) / 2;
			int colMid = (colStart + colEnd) / 2;
			Node topLeft = helper(grid, rowStart, rowMid, colStart, colMid);
			Node topRight = helper(grid, rowStart, rowMid, colMid + 1, colEnd);
			Node bottomLeft = helper(grid, rowMid + 1, rowEnd, colStart, colMid);
			Node bottomRight = helper(grid, rowMid + 1, rowEnd, colMid + 1, colEnd);
			return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
		}
	}

	public boolean hasAllSameValues(int[][] grid, int rowStart, int rowEnd, int colStart, int colEnd) {
		int val = grid[rowStart][colStart];
		for (int i = rowStart; i <= rowEnd; i++) {
			for (int j = colStart; j <= colEnd; j++) {
				if (grid[i][j] != val) {
					return false;
				}
			}
		}
		return true;
	}

	// Definition for a QuadTree node.
	class Node {
		public boolean val;
		public boolean isLeaf;
		public Node topLeft;
		public Node topRight;
		public Node bottomLeft;
		public Node bottomRight;

		public Node() {
			this.val = false;
			this.isLeaf = false;
			this.topLeft = null;
			this.topRight = null;
			this.bottomLeft = null;
			this.bottomRight = null;
		}

		public Node(boolean val, boolean isLeaf) {
			this.val = val;
			this.isLeaf = isLeaf;
			this.topLeft = null;
			this.topRight = null;
			this.bottomLeft = null;
			this.bottomRight = null;
		}

		public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
			this.val = val;
			this.isLeaf = isLeaf;
			this.topLeft = topLeft;
			this.topRight = topRight;
			this.bottomLeft = bottomLeft;
			this.bottomRight = bottomRight;
		}
	}

}
