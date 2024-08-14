package com.example.leetcode;

//https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/

public class FindWinnerOnATicTacToeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
		FindWinnerOnATicTacToeGame obj = new FindWinnerOnATicTacToeGame();
		System.out.println(obj.tictactoe(moves));
	}
	
	public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        boolean isXTurn = true;
        int emptyCount = 0;
        for(int[] cell : moves) {
            board[cell[0]][cell[1]] = isXTurn ? 'X' : 'O';
            isXTurn = !isXTurn;
            emptyCount++;
        }
        boolean xWin = hasWon(board, 'X');
        
        if(xWin) {
            return "A";
        } else if(hasWon(board, 'O')) {
            return "B";
        }
        if(emptyCount<9) {
            return "Pending";
        }
        return "Draw";
    }

    public boolean hasWon(char[][] board, char player) {
        for(int i=0; i<3; i++) {
            if(board[i][0]==player && board[i][1]==player && board[i][2]==player) {
                return true;
            }
        }

        for(int j=0; j<3; j++) {
            if(board[0][j]==player && board[1][j]==player && board[2][j]==player) {
                return true;
            }
        }

        if(board[0][0]==player && board[1][1]==player && board[2][2]==player) {
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player) {
            return true;
        }
        return false;
    }

}
