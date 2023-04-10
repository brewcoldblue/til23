package b2096;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] arr = new int[N+2][3];
		int[][] dp1 = new int[N+2][3];
		int[][] dp2 = new int[N+2][3];
		
		for(int r=1; r<=N; r++) {
			for(int c=0; c<=2; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
		for(int r=1; r<=N+1; r++) {
			for(int c=0; c<=2; c++) {
				if(c==0) {
					dp1[r][c] = Math.max(dp1[r-1][c], dp1[r-1][c+1])+arr[r][c];
					dp2[r][c] = Math.min(dp2[r-1][c], dp2[r-1][c+1])+arr[r][c];
				}
				if(c==1) {
					dp1[r][c] = Math.max(Math.max(dp1[r-1][c], dp1[r-1][c+1]),dp1[r-1][c-1])+arr[r][c];
					dp2[r][c] = Math.min(Math.min(dp2[r-1][c], dp2[r-1][c+1]),dp2[r-1][c-1])+arr[r][c];
				}
				if(c==2) {
					dp1[r][c] = Math.max(dp1[r-1][c], dp1[r-1][c-1])+arr[r][c];
					dp2[r][c] = Math.min(dp2[r-1][c], dp2[r-1][c-1])+arr[r][c];
				}
			}
		}
		int max = Math.max(Math.max(dp1[N+1][0], dp1[N+1][1]), dp1[N+1][2]);
		int min = Math.min(Math.min(dp2[N+1][0], dp2[N+1][1]), dp2[N+1][2]);
		System.out.println(max+" "+min);
	}
}
