package com.example.leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumberOfDigits {
	
	public int findNumbers(int[] nums) {
        int evenCount = 0;
        int oddCount = 0;
        for(int n : nums) {
            if((n>=0 && n<=9) || (n>=100 && n<=999) || (n>=10000 && n<=99999)) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        return evenCount;
    }

}
