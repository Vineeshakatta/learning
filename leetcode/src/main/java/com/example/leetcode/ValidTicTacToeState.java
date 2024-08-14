package com.example.leetcode;

//https://leetcode.com/problems/valid-tic-tac-toe-state/description/

public class ValidTicTacToeState {

	int xCount;
	int oCount;
	int emptyCount;
	char[][] gameBoard = new char[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] board = {"XOX","O O","XOX"};
		ValidTicTacToeState obj = new ValidTicTacToeState();
		System.out.println(obj.validTicTacToe(board));
	}

	public boolean validTicTacToe(String[] board) {

		// if board is empty it's valid
		if (board.length == 0) {
			return true;
		}

		this.xCount = 0;
		this.oCount = 0;
		this.emptyCount = 0;
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[row].length(); col++) {
				this.gameBoard[row][col] = board[row].charAt(col);
				if (board[row].charAt(col) == 'X') {
					this.xCount++;
				} else if (board[row].charAt(col) == 'O') {
					this.oCount++;
				} else {
					this.emptyCount++;
				}
			}
		}
		// X must either be one ahead or the same
		boolean numXPossible = ((this.xCount - this.oCount) <= 1);
		if (!numXPossible) {
			return false;
		}

		boolean xWin = checkForWin('X');
		boolean oWin = checkForWin('O');

		if (this.emptyCount == 9) { // if the board is empty ( 3 X 3 =9)
			return true;
		} else if (this.oCount > this.xCount) { // count for O can't be greater because X starts first
			return false;
		} else if (xWin && oWin) { // both can't win at the same time
			return false;
		} else if (oWin && this.xCount > this.oCount) { // if O wins but X tried putting even after O won
			return false;
		} else if (xWin && this.xCount - this.oCount == 0) { // X wins but O tried putting even after X won
			return false;
		} else if (this.xCount - this.oCount == 1) { // X is always 1 step ahead of O
			return true;
		} else if (this.xCount == this.oCount && this.emptyCount > 0) { // if X and O have same count then there are
																		// more than one empty cells in the grid
			return true;
		}
		return false;
	}

	public boolean checkForWin(char ch) {

		for (int i = 0; i < 3; i++) {
			if (this.gameBoard[i][0] == ch && this.gameBoard[i][1] == ch && this.gameBoard[i][2] == ch) {
				return true;
			}
		}

		for (int j = 0; j < 3; j++) {
			if (this.gameBoard[0][j] == ch && this.gameBoard[1][j] == ch && this.gameBoard[2][j] == ch) {
				return true;
			}
		}

		if (this.gameBoard[0][0] == ch && this.gameBoard[1][1] == ch && this.gameBoard[2][2] == ch) {
			return true;
		}

		if (this.gameBoard[0][2] == ch && this.gameBoard[1][1] == ch && this.gameBoard[2][0] == ch) {
			return true;
		}
		return false;
	}

}
