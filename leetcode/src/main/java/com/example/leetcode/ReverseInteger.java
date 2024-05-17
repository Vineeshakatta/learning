package com.example.leetcode;

//https://leetcode.com/problems/reverse-integer/description/
	
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -120;
		ReverseInteger obj = new ReverseInteger();
		System.out.println(obj.reverseInteger(x));
	}
	
	public int reverseInteger(int x) {
		if(x>=0 && x<=9) {
			return x;
		}
		int initialX = x;
		int ans = 0;
		if(x<0) {
			x = x * -1;
		}
		while(x>0) {
			if(ans>(Integer.MAX_VALUE - x%10)/10) {
                return 0;
            }
			ans = ans * 10 + x%10;
			x = x/10;
		}
		return initialX < 0 ? -ans : ans;
	}

}
