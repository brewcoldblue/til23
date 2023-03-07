package s5644;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int M = sc.nextInt();
			int A = sc.nextInt();
			
			int[] arrA = new int[M];
			int yA= 0;
			int xA= 0;

			int[] arrB = new int[M];
			int yB= 9;
			int xB= 9;
			
			for(int i=0; i<M; i++) {
				arrA[i] = sc.nextInt();
			}
			for(int i=0; i<M; i++) {
				arrB[i] = sc.nextInt();
			}
			
			int[][] charge = new int[10][10];
			for(int r=0; r<10; r++) {
				for(int c=0; c<10; c++) {
					charge[r][c] = 0;
				}
			}//2차원 배열을 만듭니다.
			
			for(int i =0; i<A; i++) {
				int APx = sc.nextInt();
				int APy = sc.nextInt();
				int C = sc.nextInt();
				int P = sc.nextInt();
				for (int p=0; p<=C; p++) { 
					//y좌표가 중심이면, 그 x좌표를 중심으로 x-C ~ x+C
					//y좌표가 중심에서 1 차이나면, 그 x좌표를 중심으로 x-(c-1) ~ x+(c-1)
					//y좌표가 중심에서 2 차이나면, 그 x좌표를 중심으로 x-(c-2) ~ x+(c-2)
					//y좌표가 중심에서 p 차이나면(p<=c) 그 x좌표를 중심으로 x-(c-p) ~ x+(c-p)
					//y좌표가 중심에서 C 차이나면 그 x좌표를 중심으로 x-0 ~ x+0이어야 함
					for(int t=-(C-p); t<=C-p; t++) {
						charge[APy-p][APx+t] += P;
						charge[APy+p][APx+t] += P; //파워 정보를 넣어줍니다.
						//근데 겹치면 어떡하지? 몰라...
					}
				}
			}
		}
	}
}
