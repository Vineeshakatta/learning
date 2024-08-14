package com.interview150.leetcode;

import java.util.HashMap;

//https://leetcode.com/problems/word-pattern/description

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba", s = "dog cat cat dog";
		WordPattern obj = new WordPattern();
		System.out.println(obj.wordPattern(pattern, s));

	}
	
	public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        if(pattern.length()!=word.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c)) {
                if(!map.get(c).equals(word[i])) {
                    return false;
                }
            } else {
                if(map.containsValue(word[i])) {
                    return false;
                }
                map.put(c, word[i]);
            }
        }
        return true;
    }

}
