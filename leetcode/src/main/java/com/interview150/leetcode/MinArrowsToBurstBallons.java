package com.interview150.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

public class MinArrowsToBurstBallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{1,2},{3,4},{5,6},{7,8}};
		MinArrowsToBurstBallons obj = new MinArrowsToBurstBallons();
		System.out.println(obj.findMinArrowShots(points));

	}

	public int findMinArrowShots(int[][] points) {
		if (points.length == 0)
			return 0;

		Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

		int count = 1;
		int preEnd = points[0][1];

		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > preEnd) {
				count++;
				preEnd = points[i][1];
			}
		}

		return count;
	}

}
