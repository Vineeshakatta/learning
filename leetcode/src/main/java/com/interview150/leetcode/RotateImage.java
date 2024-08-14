package com.interview150.leetcode;

//https://leetcode.com/problems/rotate-image/

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		RotateImage obj = new RotateImage();
		obj.rotate(matrix);

	}

	public void rotate(int[][] matrix) {
		transferRowCol(matrix);
		swap(matrix);
	}

	public void transferRowCol(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public void swap(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			int left = 0;
			int right = matrix.length - 1;
			while (left < right) {
				int temp = matrix[r][left];
				matrix[r][left] = matrix[r][right];
				matrix[r][right] = temp;
				left++;
				right--;
			}
		}
	}

}
