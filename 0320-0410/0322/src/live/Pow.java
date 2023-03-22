package live;

import java.util.Scanner;

public class Pow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int tc=1; tc<=T; tc++) {
			int tcn = sc.nextInt();
			int C = sc.nextInt();
			int N = sc.nextInt();
		System.out.println("#"+tc+" "+pow(C,N));
		}
	}
	
	
	//거듭제곱 구하기: 반복문 돌려보기
//	public int pow(int C, int N) {
//		
//	}
	
	//재귀함수 돌려보기
	public static int pow(int C, int N) {
		if(N==1) return C;
		


		if(N%2==0) {
			int even = pow(C, N/2);
			return even*even;
		}
		else {
			int odd = pow(C, (N-1)/2);
			return odd*odd*C;
		}
	}
	
}
