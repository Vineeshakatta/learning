package com.interview150.leetcode;

//https://leetcode.com/problems/substring-with-concatenation-of-all-words

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStrWithConcatOfAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "barfoothefoobarman";
		String[] words = {"foo","bar"};
		SubStrWithConcatOfAllWords obj = new SubStrWithConcatOfAllWords();
		System.out.println(obj.findSubstring(s, words));

	}

	public List<Integer> findSubstring(String s, String[] words) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return result;
		}
		// frequency of words
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String w : words) {
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		int len = words[0].length();
		for (int j = 0; j < len; j++) {
			HashMap<String, Integer> currentMap = new HashMap<String, Integer>();
			int start = j;// start index of start
			int count = 0;// count totoal qualified words so far
			for (int i = j; i <= s.length() - len; i = i + len) {
				String sub = s.substring(i, i + len);
				if (map.containsKey(sub)) {
					// set frequency in current map
					currentMap.put(sub, currentMap.getOrDefault(sub, 0) +1);
					count++;
					while (currentMap.get(sub) > map.get(sub)) {
						String left = s.substring(start, start + len);
						currentMap.put(left, currentMap.get(left) - 1);
						count--;
						start = start + len;
					}
					if (count == words.length) {
						result.add(start); // add to result
						// shift right and reset currentMap, count & start point
						String left = s.substring(start, start + len);
						currentMap.put(left, currentMap.get(left) - 1);
						count--;
						start = start + len;
					}
				} else {
					currentMap.clear();
					start = i + len;
					count = 0;
				}
			}
		}
		return result;
	}

	public List<Integer> findSubstring2(String s, String[] words) {
		Map<String, Integer> counts = new HashMap<>();
		for (String word : words) {
			counts.put(word, counts.getOrDefault(word, 0) + 1);
		}
		List<Integer> indexes = new ArrayList<>();
		int n = s.length(), num = words.length, len = words[0].length();
		for (int i = 0; i < n - num * len + 1; i++) {
			Map<String, Integer> seen = new HashMap<>();
			int j = 0;
			while (j < num) {
				String word = s.substring(i + j * len, i + (j + 1) * len);
				if (counts.containsKey(word)) {
					seen.put(word, seen.getOrDefault(word, 0) + 1);
					if (seen.get(word) > counts.getOrDefault(word, 0)) {
						break;
					}
				} else {
					break;
				}
				j++;
			}
			if (j == num) {
				indexes.add(i);
			}
		}
		return indexes;
	}

}
