package b11048;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		//dp �迭 ����. ��� ���� 1���� �����ϱ� ������ ������
		int[][] arr = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		//�Է��Է�
		for(int r=1; r<N+1; r++) {
			for(int c=1; c<M+1; c++) {
				arr[r][c] = sc.nextInt(); 
			}
		}
		
		for(int r=1; r<N+1; r++) {
			for(int c=1; c<M+1; c++) {
				//dp ���̺��� �� �� ���� �� ���� ū ���� ����, �� �迭�� �ִ� ���� ���� ���� �ش� ��ġ�� ���� �ִ��� ��
				dp[r][c] = Math.max(Math.max(dp[r-1][c], dp[r][c-1]), dp[r-1][c-1])+arr[r][c];
			}
		}
		System.out.println(dp[N][M]);
	}
}
