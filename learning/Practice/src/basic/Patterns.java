package basic;

public class Patterns {

	public static void main(String[] args) {
		
		pattern(4);
//		pattern2(4);
//		pattern4(5);
//		pattern5(5);
		pattern28(5);

	}
	
	static void pattern(int n) {
		for(int row=1; row<=n;row++) {
			for(int col = 4; col>=row;col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int row=1; row<=n; row++) {
			for(int col =1; col<= n+1-row ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int row =1; row<=n; row++) {
			for(int col =1; col<=row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	static void pattern5(int n) {
		for(int row=1; row<=2*n-1; row++) {
			int c = 0;
			if(row>n) {
				c = 2*n -row; // n - (row - n)
			} else {
				c = row;
			}
			for(int col=1; col<=c; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern28( int n) {
		for(int row=0; row<2*n; row++) {
			int c=0;
			if(row>n) {
				c = 2*n -row; // n - (row - n)
			} else {
				c = row;
			}
			int noOfSpaces = n-c;
			for(int s=0; s<noOfSpaces; s++) {
				System.out.print(" ");
			}
			for(int col=0; col<c; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	

}
