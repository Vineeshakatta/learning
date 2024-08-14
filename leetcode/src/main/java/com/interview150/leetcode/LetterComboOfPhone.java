package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

public class LetterComboOfPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		LetterComboOfPhone obj = new LetterComboOfPhone();
		System.out.println(obj.letterCombinations(digits));
	}
	
	public List<String> letterCombinations(String digits) {
		if(digits.isEmpty()) {
			return new ArrayList<>();
		}
		List<String> list = new ArrayList<>();
		list.addAll(letterCombo("" , digits));
		return list;
	}
	
	public List<String> letterCombo(String p, String digits) {
		if(digits.isEmpty()) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		List<String> list = new ArrayList<>();
		int digit = digits.charAt(0)-'0';
		if(digit<7 && digit>1) {
			for(int i=(digit-2)*3; i<(digit-1)*3; i++) {
				char ch = (char) ('a'+i);
				list.addAll(letterCombo(p+ch, digits.substring(1)));
			}
		} else if(digit==7) {
			for(int i=(digit-2)*3; i<=(digit-1)*3; i++) {
				char ch = (char)('a'+i);
				list.addAll(letterCombo(p+ch, digits.substring(1)));
			}
		} else if(digit==8) {
			for(int i=1 + (digit-2)*3; i<((digit-1)*3)+1; i++) {
				char ch = (char)('a'+ i);
				list.addAll(letterCombo(p+ch, digits.substring(1)));
			}
		} else if(digit==9) {
			for(int i=1+(digit-2)*3; i<=1+(digit-1)*3; i++) {
				char ch = (char)('a'+i);
				list.addAll(letterCombo(p+ch, digits.substring(1)));
			}
		}
		return list;
	}

}
