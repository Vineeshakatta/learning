package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/insert-interval/description/

public class InsertInterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
		int[] newInterval = { 4, 8 };
		InsertInterval obj = new InsertInterval();
		System.out.println(obj.insert(intervals, newInterval));

	}

	public int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();

		// Iterate through intervals and add non-overlapping intervals before
		// newInterval
		int i = 0;
		while (i < intervals.length && intervals[i][1] < newInterval[0]) {
			result.add(intervals[i]);
			i++;
		}

		// Merge overlapping intervals
		while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
			newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
			newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			i++;
		}

		// Add merged newInterval
		result.add(newInterval);

		// Add non-overlapping intervals after newInterval
		while (i < intervals.length) {
			result.add(intervals[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}

	public int[][] insert2(int[][] intervals, int[] newInterval) {
		int start = newInterval[0];
		int end = newInterval[1];
		List<int[]> list = new ArrayList<>();
		for (int[] interval : intervals) {
			int curStart = interval[0];
			int curEnd = interval[1];
			if (start > curEnd) {
				list.add(new int[] { curStart, curEnd });
			} else if (end < curStart) {
				list.add(new int[] { start, end });
				start = curStart;
				end = curEnd;
			} else {
				start = Math.min(start, curStart);
				end = Math.max(end, curEnd);
			}
		}
		list.add(new int[] { start, end });
		int[][] res = new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			res[i][0] = list.get(i)[0];
			res[i][1] = list.get(i)[1];
		}
		return res;
	}

}
