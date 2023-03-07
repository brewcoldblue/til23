package s1209;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int i=1; i<=T; i++) {
			//인덱스를 늘린 배열을 만들어서 가장 마지막 행/열에 sum을 집어넣는 방법
			//근데 좌측 하단 방향 대각선을 처리할 방도가 없어서... 열을 하나 더 팠다(구차)
			int[][] arr = new int[101][102];
			
			int TC = sc.nextInt();
			
			for(int c=0; c<100; c++) {
				for(int r=0; r<100; r++) {
					//입력을 받아 2차원 배열을 만든다
					arr[c][r] = sc.nextInt();
				}				
			}

			for(int c=0; c<100; c++) {
				for(int r=0; r<100; r++) {
					arr[c][100] += arr[c][r]; //row sum은 각 row의 끝에 (c, 100)
					arr[100][r] += arr[c][r]; //column sum은 각 column의 끝에 (100, r)
          if(c==r) arr[100][100] += arr[c][r]; //우하단 대각선 합은 (100,100)
					if(c+r==99) arr[100][101] += arr[c][r]; //좌하단 대각선 합은 (100,101)
				}				
			}
			int answer = 0;
			for(int r=0; r<101; r++) { //순회하면서 비교, 최댓값 찾기
				if(arr[100][r] > answer) answer = arr[100][r];
        if(arr[r][100] > answer) answer = arr[r][100];
			}
			//두 개의 대각선 값도 고려하여 최댓값 찾기
			if(arr[100][100] > answer) answer = arr[100][100];
      if(arr[100][101] > answer) answer = arr[100][101];
			System.out.println("#"+i+" "+answer);
			}

	}
}