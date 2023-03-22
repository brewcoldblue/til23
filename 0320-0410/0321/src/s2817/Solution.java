package s2817;

import java.util.Scanner;

public class Solution {
	
	static int N;
	static int K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			int[] arr = new int[N];
			for (int n=0; n<N; n++) {
				int input = sc.nextInt();
				arr[n] = input;
			}
			
			int answer = 0;
			
			//비트마스킹을 활용해 powerset을 모두 구하면서 더합니다.
			//더한 값 temp가 K와 같은지 비교합니다.
			
				//1<<N == 2**N
			for (int i=0; i<(1<<N); i++) {
				int temp = 0;
				for (int j=0; j<N; j++) {
					
					//i번째 부분집합과 2**j를 비트 연산했을 때 같은 부분이 있다면 부분집합이므로
					//temp에 arr[j]를 더합니다.
					if((i & (1<<j)) != 0) {
						temp += arr[j];
					}
				}
				if(temp == K) answer++;
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
	
}
