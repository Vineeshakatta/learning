package basic;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort {
	
	public static void countSort(int[] arr) {
		if(arr==null || arr.length<=1) {
			return;
		}
		int max = arr[0];
		for(int i : arr) {
			if(i>max) {
				max = i;
			}
		}
		int[] freq = new int[max+1];
		
		for(int val : arr) {
			freq[val]++;
			
		}
		
		int index =0;
		for(int i=0; i<=max;i++) {
			while(freq[i]>0) {
				arr[index]=i;
				index++;
				freq[i]--;
			}
		}
	}
	
	public static void countSortHash(int[] arr) {
		if(arr==null || arr.length<=1) {
			return;
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int val : arr) {
			hashMap.put(val, hashMap.getOrDefault(val,  0)+1);
		}
		
		int index =0;
		for(int i=min; i<=max; i++) {
			int count = hashMap.getOrDefault(i, 0);
			for(int j=0; j<count; j++){
				arr[index] = i;
				index++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
		countSortHash(arr);
	    System.out.println(Arrays.toString(arr));
	}

}
