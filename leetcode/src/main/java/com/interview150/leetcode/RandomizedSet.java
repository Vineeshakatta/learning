package com.interview150.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//https://leetcode.com/problems/insert-delete-getrandom-o1/description

public class RandomizedSet {

	private ArrayList<Integer> list;
    private Map<Integer, Integer> map;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean search(int val) {
        return map.containsKey(val);
    }
    
    public boolean insert(int val) {
        if(search(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!search(val)) {
            return false;
        }
        // to remove first get the index of given val
        int index = map.get(val);
        // take the last value from the list
        // insert the lastVal in the given val idx
        list.set(index, list.get(list.size()-1));
        // update the lastVal index
        map.put(list.get(index), index);
        // remove the val
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

}
