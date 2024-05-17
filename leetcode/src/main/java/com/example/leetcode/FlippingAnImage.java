package com.example.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,1,0}, {1,0,1},{0,0,0}};
		FlippingAnImage obj = new FlippingAnImage();
		System.out.println(Arrays.deepToString(obj.flipAndInvertImage(image)));

	}
	
	public int[][] flipAndInvertImage(int[][] image) {
		for(int[] row : image) {
			for(int i=0; i<(image.length+1)/2; i++) {
				int temp = row[i]^1;
				row[i] = row[row.length-1-i]^1;
				row[row.length-1-i] = temp;
			}
		}
		return image;
	}
	
	

}
