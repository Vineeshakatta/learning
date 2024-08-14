package com.interview150.leetcode;

//https://leetcode.com/problems/valid-sudoku/description/

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'5','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
						,{'.','9','8','.','.','.','.','6','.'}
						,{'8','.','.','.','6','.','.','.','3'}
						,{'4','.','.','8','.','3','.','.','1'}
						,{'7','.','.','.','2','.','.','.','6'}
						,{'.','6','.','.','.','.','2','8','.'}
						,{'.','.','.','4','1','9','.','.','5'}
						,{'.','.','.','.','8','.','.','7','9'}};
		ValidSudoku obj = new ValidSudoku();
		System.out.println(obj.isValidSudoku(board));
	}

	public boolean isValidSudoku(char[][] board) {

		// for each row
		for (int i = 0; i < 9; i++) {
			boolean[] used = new boolean[9];
			for (int j = 0; j < 9; j++) {
				char c = board[i][j];
				if (c != '.') {
					int idx = c - '1';
					if (used[idx]) {
						return false;
					}
					used[idx] = true;
				}
			}
		}

		// for each column
		for (int j = 0; j < 9; j++) {
			boolean[] used = new boolean[9];
			for (int i = 0; i < 9; i++) {
				char c = board[i][j];
				if (c != '.') {
					int idx = c - '1';
					if (used[idx]) {
						return false;
					}
					used[idx] = true;
				}
			}
		}

		// for each 3 * 3 sub-box
		for (int k = 0; k < 9; k++) {
			boolean[] used = new boolean[9];
			for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
				for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
					char c = board[i][j];
					if (c != '.') {
						int idx = c - '1';
						if (used[idx]) {
							return false;
						}
						used[idx] = true;
					}
				}
			}
		}
		return true;
	}

}
