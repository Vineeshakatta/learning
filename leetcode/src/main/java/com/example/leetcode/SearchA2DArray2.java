package com.example.leetcode;

//https://leetcode.com/problems/search-a-2d-matrix-ii

public class SearchA2DArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 5;
		SearchA2DArray2 obj = new SearchA2DArray2();
		System.out.println(obj.searchMatrix(matrix, target));
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(endRow>=startRow && endCol>=startCol) {
            if(matrix[startRow][endCol]==target) {
                return true;
            } else if(matrix[startRow][endCol]<target) {
                startRow++;
            } else {
                endCol--;
            }
        }
        return false;
    }

}
