package basic;

public class SQRTDecomposition {
	
	public static void main(String[] args) {
		int[] arr = {1,3,5,2,7, 6,3,1,4,8};
		int n = arr.length;
		int sqrtOfn = (int)Math.sqrt(n);
		int[] blocks = new int[sqrtOfn+1]; 
		
		int block_id = -1;
		
		for(int i=0; i<n;i++) {
			if(i%sqrtOfn==0) {
				block_id++;
			}
			blocks[block_id] +=arr[i];
		}
		System.out.println(query(blocks, arr, 2, 7, sqrtOfn));
	}
	
	public static int query(int[] blocks, int[] arr, int l, int r, int sqrt) {
		int ans =0;
		
		while(l%sqrt!=0 && l<r && l!=0) {
			ans += arr[l];
			l++;
		}
		
		while(l + sqrt <=r) {
			ans +=blocks[l/sqrt];
			l++;
		}
		
		while(l<=r) {
			ans+=arr[l];
			l++;
		}
		
		return ans;
	}
	
	public static void update(int[] blocks, int[] arr, int val, int index, int sqrt ) {
		int block_id = index/sqrt;
		blocks[block_id] += val - arr[index];
		arr[index] = val;
	}

}
