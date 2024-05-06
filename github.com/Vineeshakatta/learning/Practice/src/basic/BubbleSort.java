package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
//		bubble(arr);
//		selectionSort(arr);
//		insertionSort(arr);
//		cyclicSort(arr);
//		findDisappearedNumbers(arr);
//		missingNumbers(arr);
//		int[] nums1 = {0};
//		int[] nums2 = {1};
//		int m=nums1.length;
//		int n = nums2.length;
//		merge(nums1, m, nums2, n);
//		System.out.println(Arrays.toString(nums1));
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {			
			int partition = partition(arr, low, high);
			quickSort(arr, low, partition-1);
			quickSort(arr, partition+1, high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low -1;
		for(int j = low; j<high; j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int j=0, i=m; j<n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
	static public int getZeroIndex(int[] nums1) {
		for(int i=nums1.length-1; i>=0;i--) {
			if(nums1[i]==0) {
				return i;
			}
		}
		return -1;
	}
	
	static public List<Integer> missingNumbers(int[] nums) {
		List<Integer> l = new ArrayList<>();
		int i=0;
		System.out.println(Arrays.toString(nums));
		while(i<nums.length) {
			int correct = nums[i]-1; // 4-1
			if(nums[correct]!=nums[i]) { // 
				int temp = nums[correct]; // nums[correct], nums[i]
				nums[correct] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int index=0;index<nums.length;index++) {
			if(index!=nums[index]-1)
				l.add(index);
		}
		System.out.println(l);
		return l;
	}
	
	static public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<=nums.length-1) {
            int value = nums[i]-1;
            if(nums[i]!=nums[value]) {
                int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
            } else {
            	i++;
            }
        }
        List<Integer> l = new ArrayList();
        for(int index=0; index<=nums.length-1;index++) {
            if(index != nums[index]-1) {
                l.add(index+1);
            }
        }
        System.out.println(l);
        return l;
    }
	
	static void cyclicSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int i=0;
		while(i<=arr.length-1) {
			int value = arr[i];
			if(value-1 != i) {
				int temp = arr[i];
				arr[i] = arr[value-1];
				arr[value-1] = temp;
			} else {
				// if element is at correct index, then move i pointer to 1 step forward
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	static void insertionSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<=arr.length-2; i++) {
			for(int j = i+1; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				} else {
					break;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	static void bubble(int[] arr) {
		
		boolean swap = false;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1; j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					swap = true;
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			if(!swap) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	static void selectionSort(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			int last = arr.length-1-i;
			int maxIndex = getMaxIndex(arr, 0, last);
			int temp = arr[maxIndex];
			arr[maxIndex]= arr[last];
			arr[last]= temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for(int i=0;i<=last;i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		return max;
	}

}
