package s1954;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int [N][N];

			int y=0;
			int x=-1; //배열 밖에서 시작함
			
			int count = 1;
			int n = N;
			int direction = 1; //기본적으로 우측으로 이동
			
			for(int t=0; t<2*N-1; t++) { //t = 0, 1, 2, 3, 4
				for(int i=0; i<n; i++) { //i = 0, 1, 2, 3, 4 -> 0,1,2,3 -> ...
					
					if(direction%4 == 1 && x<N-1) x++; //배열 인덱스를 벗어나지 않는 범위 안에서 좌표 증가
					if(direction%4 == 2 && y<N-1) y++;
					if(direction%4 == 3 && x>0) x--;
					if(direction%4 == 0 && y>0) y--;

					arr[y][x] = count++;
				}

				direction++;
				if(t%2==0) n = n-1;
				//숫자 입력 개수를 다시 정합니다
				//처음에는 N-1개를 입력하고, 방향 전환이 된 시점부터
				//N-1, N-2, N-2, N-3, N-3, N-4, N-4, ... , 2, 2, 1, 1개를 입력합니다.
				//그런데 최초에는 N개를 입력받고 있어서... 시작 좌표를 -1로 설정해야 합니다. (리팩토링하려고 했으나 실패함)
			}	
			
			//출력합니다
			System.out.println("#"+tc);
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					System.out.print(arr[r][c]+" ");
				}
				System.out.println();
			}
		}
	}
}
