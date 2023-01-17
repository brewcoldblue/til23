package exercise;

import java.util.Scanner;

public class E3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N 입력");
		int n = sc.nextInt();
		// N을 입력받습니다
		
		System.out.println("영양분 " + n+"*"+n +"개 " + "입력");
		int[][] ground = new int [n][n];
		// N값에 따른 2차원 배열을 만듭니다

		for (int r = 0; r<n; r++) {
			for (int c = 0; c<n; c++) {
				int t = sc.nextInt();
				ground[r][c] = t;
			}
		} // 입력을 받아서 2차원 배열 ground에 입력값을 저장합니다
		
		int[][] groundfert = new int[n][n];
		for (int r = 0; r<n; r++) {
			for (int c = 0; c<n; c++) {
				if(r==0 && c==0) groundfert[r][c] = ground[r][c] + ground[r+1][c] + ground[r][c+1];
				else if (r==n-1 && c==0) groundfert[r][c] = ground[r][c] + ground[r-1][c] + ground[r][c+1];
				else if (c==0 && r>0) groundfert[r][c] = ground[r][c] + ground[r-1][c] + ground[r+1][c] + ground[r][c+1];
				//(0,0)~(n-1,0) 사이(왼쪽 세로 변) 예외처리
				
				if(r==n-1 && c==n-1) groundfert[r][c] = ground[r][c] + ground[r][c-1] + ground[r-1][c];
				else if (r==n-1 && c>0) groundfert[r][c] = ground[r][c+1] + ground[r][c-1] + ground[r-1][c];
				else if (c==n-1 && r>0) groundfert[r][c] = ground[r-1][c] + ground[r][c-1] + ground[r+1][c]; 
				else if (r==0 && c==n-1) groundfert[r][c] = ground[r][c] + ground[r][c-1] + ground[r+1][c];
				else if (r==0 && c>0) groundfert[r][c] = ground[r][c] + ground[r][c+1] + ground[r+1][c] + ground[r][c-1];
				//나머지 세 변 예외처리
				
				if(r>0 && c>0 && r<n-1 && c<n-1) groundfert[r][c] = ground[r][c] + ground[r-1][c] + ground[r+1][c] + ground[r][c-1] + ground[r][c+1];
				//네 모서리를 제외한 안쪽
				
			}
		} // 지정될 수 없는 블록을 제외하고 카운팅 배열을 만듭니다
		
		int max = 0;
		for (int r = 0; r<n; r++) {
			for (int c = 0; c<n; c++) {
				if(groundfert[r][c] > max) max = groundfert[r][c];
			}
		} // 카운팅 배열을 순회하면서 최댓값을 찾습니다
		
		System.out.println(max);
	}
}

