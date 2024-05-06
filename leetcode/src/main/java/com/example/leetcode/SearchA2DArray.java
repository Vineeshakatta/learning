package com.example.leetcode;

public class SearchA2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target = 10;
		SearchA2DArray obj = new SearchA2DArray();
		System.out.println(obj.searchMatrix(matrix, target));

	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n -1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            int midVal = matrix[mid/n][mid%n];
            if(midVal==target) {
                return true;
            } else if(midVal<target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return false;
    }

}
