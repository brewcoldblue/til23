package s11315;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			String[][] arr = new String[N][N];
			
			for(int r=0; r<N; r++) {
				String str = sc.next();
					arr[r] = str.split("");
			} //오목 칸을 받아옵니다.
			
			int cnt = 1; //방향별로 연속한 돌의 개수
			int vcnt = 1;
			int d1cnt = 1;
			int d2cnt = 1;
			L1:
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					//오목 돌을 발견하는 순간
					if(arr[r][c].equals("o")) {
						for(int q=1; q<5; q++) { //4개가 추가로 더 있는지 파악합니다
							if(c+q <= N-1) { //배열 범위 내
								//가로 방향
								if(arr[r][c+q].equals("o")) cnt++;
							} 
							if(r+q <= N-1) { //배열 범위 내
								//세로 방향
								if(arr[r+q][c].equals("o")) vcnt++;
							} 
							if(c+q <= N-1 && r+q <= N-1) { //배열 범위 내
								//우하향 대각선 방향
								if(arr[r+q][c+q].equals("o")) d1cnt++;
							} 
							if(c>=q && r+q<N) { //배열 범위 내
								//좌하향 대각선 방향
								if(arr[r+q][c-q].equals("o")) d2cnt++;
							}
						}
						if(cnt == 5 || vcnt == 5 || d1cnt == 5 || d2cnt == 5) {
							System.out.println("#"+tc+" "+"YES"); //오목이 된 순간
							break L1; //순회를 끝냅니다
						}
						cnt = 1; //초기화
						vcnt = 1;
						d1cnt = 1;
						d2cnt = 1;
					}
				}
			if(r == N-1) System.out.println("#"+tc+" "+"NO"); //마지막까지 찾지 못하면 YES를 리턴합니다
			}
		}
	}
}
