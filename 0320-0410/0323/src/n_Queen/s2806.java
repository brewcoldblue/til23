package n_Queen;

import java.util.Scanner;

public class s2806 {
	static int[][] board;
	static boolean [][] checker;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			board = new int[N][N];
			checker = new boolean[N][N];
			checkQueen(0,0);			
		}
	}
	public static boolean checkQueen(int row, int col) {		
		//base case
		if("ㅎㅎㅎㅎㅎ") return false;
		
		
		for(int i=0; i<board.length; i++) {
		
			if(checker[row][col]) continue;
				
			checkQueen(row+1, col);
			setAttackRange(row+1, col);
		}
//		if(다음 행에 0이 없으면) return false;
//
//		그렇지 않으면 다음 행에 놓을 수 있는지 판단
//			- 0이 아닌 자리에서 checkQueen
		
		count++;
		return true;
	}

// row[1,0,0,0,0]
// col[0,1,0,0,0]
// diag[0,0,0,0,0,0,0,0,0]

	private static void setAttackRange(int row, int col) {
		
		for(int i=0; i<board.length; i++) {
			if (row+i < board.length) checker[row+i][col] = true;
			if (row-i >= 0) checker[row-i][col] = true;
			if (col+i < board.length) checker[row][col+i] = true;
			if (col-i >= 0) checker[row][col-i] = true;
			if (row+i < board.length && col+i < board.length) checker[row+i][col+i] = true;
			if (row-i >= 0 && col-i >= 0) checker[row-i][col-i] = true;
			if (row+i < board.length && col-i >= 0) checker[row+i][col-i] = true;
			if (row-i >= 0 && col+i < board.length) checker[row-i][col+i] = true;
		}
		
	}
}
