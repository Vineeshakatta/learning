package com.interview150.leetcode;

//https://leetcode.com/problems/set-matrix-zeroes

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		SetMatrixZeros obj = new SetMatrixZeros();
		obj.setZeroes(matrix);

	}

	public void setZeroes(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		boolean row[] = new boolean[n];
		boolean col[] = new boolean[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (row[i] || col[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}

}
