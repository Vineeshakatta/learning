package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/description/

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, k = 2;
		Combinations obj = new Combinations();
		obj.combine(n, k);

	}

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<>();
		combination(1, n, k, list, new ArrayList<>());
		return list;
	}

	public void combination(int start, int n, int k, List<List<Integer>> list, List<Integer> templist) {
		if (templist.size() == k) {
			list.add(new ArrayList<>(templist));
			return;
		} else {
			for (int i = start; i <= n; i++) {
				templist.add(i);
				combination(i + 1, n, k, list, templist);
				templist.remove(templist.size() - 1);
			}
		}
	}

}
