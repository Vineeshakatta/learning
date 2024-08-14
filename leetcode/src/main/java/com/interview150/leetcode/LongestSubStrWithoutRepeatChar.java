package com.interview150.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters

public class LongestSubStrWithoutRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		LongestSubStrWithoutRepeatChar obj = new LongestSubStrWithoutRepeatChar();
		System.out.println(obj.lengthOfLongestSubstring(s));
	}
	
	public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }
        return maxLength;
    }

	public int lengthOfLongestSubstring2(String s) {
		int n = s.length();
		int maxLen = 0;
		int left = 0;
		Set<Character> charSet = new HashSet<>();
		for (int right = 0; right < n; right++) {
			if (!charSet.contains(s.charAt(right))) {
				charSet.add(s.charAt(right));
				maxLen = Math.max(maxLen, right - left + 1);
			} else {
				while (charSet.contains(s.charAt(right))) {
					charSet.remove(s.charAt(left));
					left++;
				}
				charSet.add(s.charAt(right));
			}
		}
		return maxLen;
	}

}
