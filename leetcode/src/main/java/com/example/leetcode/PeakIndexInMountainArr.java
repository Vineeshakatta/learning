package com.example.leetcode;

//https://leetcode.com/problems/find-in-mountain-array/description/

public class PeakIndexInMountainArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,1};
		PeakIndexInMountainArr peakIndexObj = new PeakIndexInMountainArr();
		System.out.println(peakIndexObj.peakIndexInMountainArray(arr));

	}
	
	public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(mid!=arr.length-1 && arr[mid]>arr[mid+1]) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return start;
    }

}
