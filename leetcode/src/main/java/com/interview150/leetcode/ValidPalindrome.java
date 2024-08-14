package com.interview150.leetcode;

//https://leetcode.com/problems/valid-palindrome/description

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		ValidPalindrome obj = new ValidPalindrome();
		System.out.println(obj.isPalindrome(s));

	}

	public boolean isPalindrome2(String s) {
		char[] strArr = s.toCharArray();
		int i=0;
		StringBuilder sb = new StringBuilder();
		while(i<strArr.length) {
			if(Character.isLetterOrDigit(strArr[i])) {				
				sb.append(Character.toUpperCase(strArr[i]));
			}
			i++;
		}
		for(int j=0, k=sb.length()-1; j<k; j++, k--) {
			if(sb.charAt(j)!=sb.charAt(k)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome(String s) {
		if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
	}

}
