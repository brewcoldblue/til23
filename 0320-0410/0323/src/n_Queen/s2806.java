package n_Queen;

import java.util.Scanner;

public class s2806 {
	static int[][] board;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			//일차원 배열의 열 값에 행 좌표를 저장해 이차원 배열을 표현합니다.
			board = new int[N][N];
			checkQueen(0);
		
			
		}
	}
	public static boolean checkQueen(int cur) {		
		
//		if(다음 행에 0이 없으면) return false;
//
//		그렇지 않으면 다음 행에 놓을 수 있는지 판단
//			- 0이 아닌 자리에서 checkQueen
		
		count++;
		return true;
	}
}
