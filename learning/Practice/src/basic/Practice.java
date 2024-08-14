package basic;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
//		int a = 2147483647;
//		int[] arr = {2,0,0};
//		int[] subset = {1,2,3};
//		System.out.println(superPow(a, arr));
//		System.out.println(subseq("", "abc"));
//		System.out.println(subset(subset));
		int[] nums1 = {1,2,100};
		int[] nums2 = {2};
		System.out.println(hIndex(nums1));
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
	
	static public int hIndex(int[] citations) {
        int n = citations.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(citations[mid] < n-mid){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return n-s;
    }
	static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = merge(nums1,nums2);
        int n = mergedArray.length;
        double median = -1;
        int mid = 0;
        if(n%2==0) {
        	mid = n / 2 -1;
            median = (mergedArray[mid] + mergedArray[mid+1])/2.0;
        } else {
        	mid = n/2;
            median = (mergedArray[mid]);
        }
        return median;
    }

    static public int[] merge(int[] nums1, int[] nums2) {
        int [] merge = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]<nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else if(nums1[i]>nums2[j]) {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length) {
            merge[k] = nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length) {
            merge[k] = nums2[j];
            j++;
            k++;
        }
        return merge;
    }
	
	public static List<List<Integer>> subset(int[] arr) {
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for(int num : arr) {
			int n = outer.size();
			for(int i=0; i<n;i++) {
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
			}
		}
		return outer;
	}
	
	public static ArrayList<String> subseq(String processed, String unprocessed) {
		ArrayList<String> s = new ArrayList<>();
		if(unprocessed.isEmpty()) {
			s.add(processed);
			return s;
		}
		char ch = unprocessed.charAt(0);
		ArrayList<String> left = subseq(processed + ch, unprocessed.substring(1));
		ArrayList<String> right = subseq(processed, unprocessed.substring(1));
		left.addAll(right);
		return left;
	}
	
	public static int superPow(int a, int[] b) {
        if(a==0) {
            return 0;
        }
        int n = 0;
        for(int i=0; i<=b.length-1;i++) {
            n = (n*10 +b[i]);
        }
        
        a = a%1337;
        return (int)Math.pow(a, n);
    }

}
