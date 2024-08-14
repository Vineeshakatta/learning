package com.interview150.leetcode;

//https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1,2};
		int[] arr2 = {3,4};
		MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
		System.out.println(obj.findMedianSortedArrays(arr1, arr2));

	}
	
	public double findMedianSortedArrays(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length+arr2.length];
		int i=0;
		int j =0;
		int k=0;
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merge[k] = arr1[i];
				k++;
				i++;
			} else {
				merge[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		while(j<arr2.length) {
			merge[k] = arr2[j];
			k++;
			j++;
		} 
		while(i<arr1.length) {
			merge[k] = arr1[i];
			k++;
			i++;
		}
		int mid = merge.length/2;
		double median =0.0;
		if(merge.length%2==0) {
			median = (double)(merge[mid-1] + merge[mid]) /2;
			
		} else {
			median = merge[mid];
		}
		
		return median;
	}

}
