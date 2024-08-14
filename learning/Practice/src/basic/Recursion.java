package basic;

import java.util.Arrays;

public class Recursion {

	public static void main(String[] args) {
		
//		printNos(1);
//		System.out.println(fibo(5));
//		System.out.println(fact(4));
//		int[] arr ={1,2,5,6,8,13,43,54,67,89};
//		int target = 89;
//		System.out.println(search(arr, target, 0,arr.length-1));
//		triangle2(4,0);
//		selection(arr);
	}
	
	static void selection(int[] arr) {
		
		for(int i=0; i<arr.length-1;i++) {
			int last = arr.length-1-i;
			int max = getMaxIndex(arr, 0,last);
			if(max!=last) {				
				int temp = arr[max];
				arr[max] = arr[last];
				arr[last] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static int getMaxIndex(int[] arr, int s, int last) {
		int max = s;
		for(int i=s; i<=last;i++) {			
			if(arr[i]>arr[max]) {
				max = i;
			}
		}
		return max;
	}
	static void triangle2(int row, int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			triangle2(row, col+1);
			System.out.println("*");
		} else {
			triangle2(row-1, 0);
			System.out.println();
		}
	}
	
	static int fact(int n) {
		if(n<=2) {
			return n;
		}
		return n* fact(n-1);
	}
	
	static int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	
	static void printNos(int n) {
		if(n>5) {
			return;
		}
		System.out.println(n);
		printNos(n+1);
	}
	
	static int search(int[] arr, int target, int start, int end) {
		if(start<=end) {
			int m = start + (end - start)/2;
			if(arr[m]== target) {
				return m;
			} else if(arr[m]>target){
				return search(arr, target, start, m-1);
			} else {
				return search(arr, target, m+1, end);
			}
		} 
		return -1;
	}
	
	

}
