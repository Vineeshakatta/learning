package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/description

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		SpiralMatrix obj = new SpiralMatrix();
		System.out.println(obj.spiralOrder(matrix));
	}

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if (matrix == null || matrix.length == 0) {
			return result;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;
		int left = 0, right = cols - 1, top = 0, bottom = rows - 1;
		while (left <= right && top <= bottom) {
			for(int i=left; i<=right; i++) {
				result.add(matrix[top][i]);
			}
			top++;
			for(int i = top; i<=bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;
			if(top<=bottom) {
				for(int i=right; i>=left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}
			if(left<=right) {
				for(int i= bottom; i>=top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}
		return result;
	}

}
