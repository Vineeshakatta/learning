package basic;

import java.util.Arrays;

class ClassName {

	public static void main(String[] args) {
		
//		int[][] arr = {
//                {10, 20, 30, 40},
//                {15, 25, 35, 45},
//                {28, 29, 37, 49},
//                {33, 34, 38, 50}
//        };
//		int[][] arr = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
		int[][] arr = {{-1,3}};
		int target = 3;
		System.out.println(Arrays.toString(searchRowColSortedMatrix(arr, target)));
//		System.out.println(Arrays.toString(searchMatrix(arr, target)));
//		System.out.println(Arrays.toString(searchSortedMatrix(arr, target)));		
	}
	
	public static int[] binarySearch(int[][] arr, int rows, int cStart, int cEnd, int target) {
		
		while(cStart<=cEnd) {
			int mid = cStart + (cEnd - cStart)/2;
			if(arr[rows][mid]== target) {
				return new int[] {rows, mid};
			} 
			if(arr[rows][mid]<target){
				cStart = mid+1;
			} else {
				cEnd = mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	
	public static int[] searchSortedMatrix(int[][] arr, int target) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		if(rows==1) {
			return binarySearch(arr, 0, 0, cols-1, target);
		}
		
		int rStart =0;
		int rEnd = rows-1;
		int cMid = cols/2;
		while(rStart<(rEnd-1)) {
			int mid = rStart + (rEnd - rStart)/2;
			if(arr[mid][cMid] == target) {
				return new int[] {mid,cMid};
			} 
			if(arr[mid][cMid]> target) {
				rEnd = mid;
			} else {
				rStart= mid;
			}
		}
		
		if(arr[rStart][cMid]== target) {
			return new int[] {rStart, cMid};
		}
		if(arr[rStart+1][cMid]== target ) {
			return new int[] {rStart+1, cMid};
		}
		if(arr[rStart][cMid-1]>=target) {
			return binarySearch(arr, rStart, 0, cMid-1, target);
		} else if(arr[rStart][cMid+1]<=target&& arr[rStart][cols-1]>=target) {
			return binarySearch(arr, rStart, cMid+1, cols-1, target);
		}
		else if(arr[rStart+1][0]<=target && arr[rStart+1][cMid-1]>=target) {
			return binarySearch(arr, rStart+1, 0, cMid-1, target);
		} else {
			return binarySearch(arr, rStart+1, cMid+1, cols-1, target);
		}
		
	}
	
	public static int[] searchRowColSortedMatrix(int[][] arr, int target) {
		int r=0;
		int c = arr[0].length-1;
		while(r<arr.length && c>=0) {
			if(arr[r][c]== target) {
				return new int[] {r,c};
			}
			if(arr[r][c]<target) {
				r++;
			} else {
				c--;
			}
		}
		return new int[]{-1, -1};
	}
	public static int[] searchMatrix(int[][] arr, int target) {
		for(int i=0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[]{-1, -1};
	}

}
