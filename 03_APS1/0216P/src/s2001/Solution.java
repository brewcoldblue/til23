package s2001;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=1; i<=T; i++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][N];
		for(int r=0; r<N; r++) {
			for(int c=0; c<N; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		int[][] partialSum = new int[N][N];
		int answer = 0;
		for(int r=0; r<=N-M; r++) {
			for(int c=0; c<=N-M; c++) {
				partialSum[r][c] = arr[r][c];
				for(int p=1; p<M; p++) {
					if (M > 2) {
						partialSum[r][c] += arr[r+p][c] + arr[r][c+p] + arr[r+p][c+p];
						for(int q=1; q<p; q++) {
						partialSum[r][c] += arr[r+p][c+q] + arr[r+q][c+p];		
						}
					} else {
						partialSum[r][c] += arr[r+p][c] + arr[r][c+p] + arr[r+p][c+p];

					}
				}
				if(answer < partialSum[r][c]) answer = partialSum[r][c];
			}
		}
		System.out.println("#"+i+" "+answer);
	}
	}
}