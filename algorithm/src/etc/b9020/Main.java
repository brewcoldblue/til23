package etc.b9020;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] primes = new int[10001];
		
		for(int idx=2; idx<primes.length - 1; idx++) {
			int count = 0;
			for(int j=1; j<=Math.sqrt(idx); j++) {
				if(idx%j == 0) count++;
			}
			if(count == 1) primes[idx] = idx;
		} //인덱스로 소수 배열 만들기 (소수면 그 소수 인덱스 == 값)
		
		int[] answer = new int[2];
		
		for (int i = 0; i<T; i++) {
			int N = sc.nextInt(); //입력값 받음
			
//			for (int j = 2; j<primes.length/2; j++) { //소수 배열 반까지 순회
//				for (int k=primes.length/2; k>=2; k--) { //뒤부터 순회
//					if(primes[j]+primes[k]==N //더해서 N이 되는지
//					   && primes[j] != 0 && primes[k] != 0 //두 값이 소수인지
//					   && answer[0] < j && j <= k) { //j가 가장 클 때 두 값 사이가 적음, 값 반전되기 직전까지만
//						answer[0] = j;
//						answer[1] = k; //정답 배열에 답 추가
//					}
//				}
			
			for (int j = N/2; j>=2; j--) {
				if(primes[j] != 0 && primes[N-j] != 0) {
					answer[0] = j; 
					answer[1] = N-j;
					break;
					//j가 가장 클 때 N-j와의 차이가 가장 작은데
					//j를 큰 값에서부터 줄이고 있으므로 첫 번째 (j, N-j)쌍만 구하고
					//더 값을 찾지 못하게 나옴
				}
			}
		System.out.println(answer[0]+" "+answer[1]);
		answer[0] = 0;
		answer[1] = 0;
		}
	}
}
