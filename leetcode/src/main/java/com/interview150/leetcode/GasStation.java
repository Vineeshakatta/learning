package com.interview150.leetcode;

//https://leetcode.com/problems/gas-station/description/

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		GasStation obj = new GasStation();
		System.out.println(obj.canCompleteCircuit(gas, cost));

	}

	public int canCompleteCircuit(int[] gas, int[] cost) {
		int totalGas = 0;
		for (int g : gas) {
			totalGas += g;
		}
		int totalCost = 0;
		for (int c : cost) {
			totalCost += c;
		}

		if (totalGas < totalCost) {
			return -1;
		}
		int currentGas = 0;
		int startingIndex = 0;
		for (int i = 0; i < gas.length; i++) {
			// update current gas level by adding gas and subtracting cost at current
			// station.
			currentGas = currentGas + (gas[i] - cost[i]);
			// if the currentGas level is negative, reset it to zero and update the starting
			// index to i+1;
			if (currentGas < 0) {
				currentGas = 0;
				startingIndex = i + 1;
			}
		}
		return startingIndex;
	}

}
