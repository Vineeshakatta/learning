package com.interview150.leetcode;

//https://leetcode.com/problems/zigzag-conversion/description/

public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PAYPALISHIRING";
		int numRows = 3;
		ZigZagConversion obj = new ZigZagConversion();
		System.out.println(obj.convert(s, numRows));
	}
	
	public String convert(String s, int numRows) {
        // make an array of stringBuffer ;of length same as numrows; 
        StringBuilder[] rows = new StringBuilder[numRows];
        // we cant directly access StringBUffer i.e inside the array so we need to intialize
        for(int i=0; i<rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        int i=0;
        while(i<s.length()) {
            // vertically dawnward logic
            for(int idx=0; idx<numRows && i<s.length();idx++){
                rows[idx].append(s.charAt(i++));
            }
            
            for(int idx=numRows-2;idx>=1 && i<s.length();idx--){
                rows[idx].append(s.charAt(i++));
            }
        }
        // concat all StringBuffers
        StringBuilder result = new StringBuilder();
        for(StringBuilder curr : rows) {
            result.append(curr);
        }
        return result.toString();
    }

}
