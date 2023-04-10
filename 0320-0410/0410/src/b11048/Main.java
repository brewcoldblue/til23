package b11048;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//dp 배열 선언. 행과 열이 1부터 시작하기 때문에 맞춰줌
		int[][] arr = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		//입력입력
		for(int r=1; r<N+1; r++) {
			for(int c=1; c<M+1; c++) {
				arr[r][c] = sc.nextInt(); 
			}
		}
		
		for(int r=1; r<N+1; r++) {
			for(int c=1; c<M+1; c++) {
				//dp 테이블에서 그 전 값들 중 가장 큰 사탕 수에, 그 배열에 있는 사탕 더한 값이 해당 위치의 사탕 최댓값이 됨
				dp[r][c] = Math.max(Math.max(dp[r-1][c], dp[r][c-1]), dp[r-1][c-1])+arr[r][c];
			}
		}
		System.out.println(dp[N][M]);
	}
}
