package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recursion(list,new ArrayList<Integer>(), nums);
        return list;
    }

    public void recursion(List<List<Integer>> list, List<Integer> templist, int[] nums) {
        if(templist.size() == nums.length) {
            list.add(new ArrayList<>(templist));
            return;
        } else {
            for(int i=0; i<nums.length;i++) {
                if (templist.contains(nums[i])) continue;
                templist.add(nums[i]);
                recursion(list, templist,nums);
                templist.remove(templist.size()-1);
            }
        }
    }

}
