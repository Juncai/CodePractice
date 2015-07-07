package edu.neu.jon.lc.wordSearch;

public class Solution {
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (exist(board, i, j, word)) return true;
			}
		}
		return false;
	}
	
	private boolean exist(char[][] board, int x, int y, String word) {
		if (word.length() == 0) return true;
		if (x < 0 || x > board.length - 1) return false;
		if (y < 0 || y > board[x].length - 1) return false;
		if (board[x][y] != word.charAt(0)) return false;
		board[x][y] ^= 256; // since we only alphabetic characters, so the higher byte of the 
							// char won't be used. Using the 9th bit to mark if this char is 
							// touched or not.
		String newWord = word.substring(1);
		boolean exist = (exist(board, x + 1, y, newWord) ||
						exist(board, x - 1, y, newWord) ||
						exist(board, x, y + 1, newWord) ||
						exist(board, x, y - 1, newWord));
		board[x][y] ^= 256;
		return exist;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		char[][] board = new char[][]{{'C', 'A', 'A'},
									  {'A', 'A', 'A'},
									  {'B', 'C', 'D'}};
		String word = "AAB";
		System.out.println(s.exist(board, word));
	}
}
