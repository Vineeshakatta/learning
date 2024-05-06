package basic;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=40;
//		boolean[] primes = new boolean[n+1];
//		sieve(n, primes);
		System.out.println(binarySearchSQRT(2147395599, 3));
//		System.out.printf("%.3f",binarySearchSQRT(n, 3));
//		factorsOfNum(n);
//		factorialOfNum(n);
		// HCF of 2 numbers = minimum value of (ax+by) where a, b are 2 numbers and x,y are any 2 random numbers
		System.out.println(gcd(4,8));
		System.out.println(lcm(2, 7));
//		System.out.println(isPrime(n));
//		int[]  arr = {1,2,3,4,5,2345,45,1243,756,87523,1,1324,345,54,78,4};
//		int[] arr = {-123,-45,0,24,45,56,77,77,89,3434,4345,5676};
//		int[] arr = {-1,4,6,7,8,6,3,1,0};
//		int[] arr = {4,5,6,7,0,1,2};
		
		
//		int binaryTarget = 4345;
//		int binaryValue = binarySearch(arr, binaryTarget);
//		System.out.println(binaryValue);
//		int linearTarget = 0;
//		int linearValue = linearSearch(arr, linearTarget);
//		System.out.println(linearValue);
//		int target = 0;
//		int ceilingNumber = ceilingBinarySearch(arr, target);
//		System.out.println(ceilingNumber);
//		char[] letters = {'c','f','j'};
//        char target = 'c';
//        System.out.println(nextGreatestLetter(letters, target));
//		int target = 45;
//		System.out.println(binarySearchInfinityArr(arr, target));
//		System.out.println(pickElement(arr));
//		int pivot = pivot(arr);
//		int target = 0;
//		int binarySearchValue = binarySearch(arr,target,0, pivot);
//        if(binarySearchValue==-1) {
//            binarySearchValue = binarySearch(arr,target,pivot+1, arr.length-1);
//        }
//        System.out.println(binarySearchValue);
	}
	
	public static int binarySearch(int[] nums, int target, int start, int end) {
        while(start <=end) {
            int mid = start+ (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            } else if(nums[mid]<target){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
	
	public static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]>nums[mid+1]) {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]) {
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
	
	public static int pickElement(int[] arr) {
		int start =0;
		int end = arr.length-1;
//		{-1,4,6,7,8,6,3,1,0};
		while(start<end) {
			int mid = start + (end - start)/2;
			if(arr[mid] > arr[mid+1]){
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
	
	static int binarySearchInfinityArr(int[] arr, int target) {
		int start =0;
		int end = 1;
		while(target > arr[end]) {
			int temp= end+1;
			end = end + (end-start+1)*2;
			start = temp;
		}
		return binarySearchInfArr(arr, target, start, end);
	}
	
	static int binarySearchInfArr(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(target< arr[mid]) {
				end = mid-1;
			} else if(target> arr[mid]) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	static int ceilingBinarySearch(int[] arr, int target) {
		int start =0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid] > target) {
				end = mid-1;
			} else if(arr[mid] < target) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return start;
	}
	
	static int linearSearch(int[] arr, int linearTarget) {
		int start =0;
		int end = arr.length-1;
			for(int i=start; i<end; i++) {				
				if(arr[i]== linearTarget) {
					return i;
				}
			}
		return -1;
	}

	static int binarySearch(int[] arr, int binaryTarget) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {			
			int mid = start + (end - start)/2;
			if(arr[mid-1]>binaryTarget) {
				end = mid-1;
			} else if(arr[mid-1]<binaryTarget) {
				start = mid+1;
			} else {
				return mid;
			}
		}
		return -1;
		
	}
	
	public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        while(start<=end) {
            int mid = start + (end - start)/2;
            if(target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid+1;
            }
        }
        return letters[start%letters.length];
    }
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}
	
	public static void sieve(int n, boolean[] primes) {
		for(int i=2; i*i<n;i++) {
			if(!primes[i]) {
				for(int j=2*i; j<=n; j+=i) {
					primes[j] = true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				System.out.print(i +" ");
			}
		}
	}
	
	public static double binarySearchSQRT(int n, int p) {
		int start =0;
		int end = n;
		double root = 0.0;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(mid*mid == n) {
				return mid;
			}
			if(mid * mid<n) {
				start = mid+1;
			} else {
				end = mid-1;
			}
		}
		double incr = 0.1;
		for(int i=0; i<p; i++) {
			while(root*root<=n) {
				root+=incr;
			}
			root -= incr;
			incr/=10;
		}
		return root;
	}
//	O(n)
	public static void factorsOfNum(int n) {
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
	}
//	O(sqrt(n))
	public static void factorialOfNum(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				if(n/i==i) {
					System.out.print(i+ " ");
				} else {					
					System.out.print(i + " ");
					list.add(n/i);
				}
			}
		}
		
		for(int j=list.size()-1; j>=0;j--) {
			System.out.print(list.get(j) + " ");
		}
	}
	
	public static int gcd(int a, int b) {
		if(a==0) {
			return b;
		}
		return gcd(b%a, a); // not gcd(a%b, b)
	}
	
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
}
