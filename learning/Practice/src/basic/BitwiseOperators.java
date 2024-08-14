package basic;

import java.util.Arrays;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int n = 79;
		System.out.println(isOdd(n));
//		int[] arr = {2,3,2,7,7,8,8};
//		System.out.println(findUnique(arr));
		int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
		System.out.println(Arrays.deepToString(flipImage(arr)));
	}
	
	static int[][] flipImage(int[][] image) {
		for(int[] row : image) {
			for(int i=0;i<(image[0].length+1)/2;i++) {
				int temp = row[i] ^ 1;
				row[i] = row[row.length-1-i] ^ 1;
				row[row.length-1-i]= temp;
			}
		}
		return image;
	}
	
	static int findUnique(int[] arr) {
		int unique = 0;
		for(int n : arr) {
			unique ^= n;
		}
		return unique;
	}
	
	static boolean isOdd(int n) {
		return (n & 1)==1;
	}

}
