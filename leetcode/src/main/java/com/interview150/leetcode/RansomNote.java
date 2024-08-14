package com.interview150.leetcode;

//https://leetcode.com/problems/ransom-note/description

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa", magazine = "aab";
		RansomNote obj = new RansomNote();
		System.out.println(obj.canConstruct(ransomNote, magazine));

	}

	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> magMap = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {
			char ch = magazine.charAt(i);
			magMap.put(ch, magMap.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < ransomNote.length(); i++) {
			char c = ransomNote.charAt(i);

			if (magMap.containsKey(c) && magMap.get(c) > 0) {
				magMap.put(c, magMap.get(c) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

}
