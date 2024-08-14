package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/merge-intervals/

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		MergeIntervals obj = new MergeIntervals();
		System.out.println(Arrays.deepToString(obj.merge(intervals)));

	}

	public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i=1; i<intervals.length; i++) {
            int[] interval = intervals[i];
            if(interval[0]<=prev[1]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                result.add(prev);
                prev = interval;
            }
        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }

}
