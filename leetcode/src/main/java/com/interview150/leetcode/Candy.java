package com.interview150.leetcode;

//https://leetcode.com/problems/candy/description/

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ratings = { 1, 0, 2 };
		Candy candy = new Candy();
		System.out.println(candy.candy2(ratings));
	}

	public int candy(int[] ratings) {

		int[] left = new int[ratings.length];
		int[] right = new int[ratings.length];
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				left[i] = left[i - 1] + 1;
			}
		}

		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i + 1] < ratings[i]) {
				right[i] = right[i + 1] + 1;
			}
		}
		int[] ans = new int[ratings.length];
		int sum = 0;
		for (int i = 0; i < ratings.length; i++) {
			ans[i] = Math.max(left[i], right[i]);
			sum = sum + ans[i] + 1;
		}
		return sum;
	}
	
	public int candy2(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        for(int i=1; i<n; i++) {
            if(ratings[i-1] < ratings[i] && candies[i-1]>=candies[i]) {
                candies[i] = candies[i-1] + 1;
            }
        }

        for(int i= n-2; i>=0; i--) {
            if(ratings[i+1]<ratings[i] && candies[i+1]>=candies[i]) {
                candies[i] = candies[i+1] +1;
            }
        }
        int totalCandies = 0;
        for(int i=0; i<candies.length; i++) {
            totalCandies+= candies[i] +1;
        }
        return totalCandies;
    }

}
