package etc.b9020;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		test1();
		test2();
		
		
	}
	public static void test2() {
		long start = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] prime = new int[10001];
		
		// 10000까지 소수 구분 해둠
		for(int i = 2; i <= Math.sqrt(10000); i++) {
			for(int j = i; j <= 10000 / i; j++) {
				prime[i * j] = 1;
			}
		}
		
		// 2로 나눠서 가운데부터 소수 찾기
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt(); 
			for(int j = n / 2; j >= 2; j--) {
				if(prime[j] == 0 && prime[n - j] == 0) {
					System.out.println(j + " " + (n - j));
					break;
				}
			}
		}
		long end = System.nanoTime();
		System.out.println("소수의 배수만 거를 경우 : "+ (end-start )+" ns.");
	}
	public static void test1() {
			Scanner sc = new Scanner(System.in);
			long start = System.nanoTime();
			int T = sc.nextInt();
			int[] prime = new int[10001];
			
			// 10000까지 소수 구분 해둠
			for(int i = 2; i <= Math.sqrt(10000); i++) {
				if(prime[i] == 0) {		// 예를 들어 12는 2랑 3에서 소수를 없앴음
					for(int j = i; j <= 10000 / i; j++) { 
						prime[i * j] = 1;
					}
				}
			}
			
			// 2로 나눠서 가운데부터 소수 찾기
			for(int i = 0; i < T; i++) {
				int n = sc.nextInt(); 
				for(int j = n / 2; j >= 2; j--) {
					if(prime[j] == 0 && prime[n - j] == 0) {
						System.out.println(j + " " + (n - j));
						break;
					}
				}
			}		
			long end = System.nanoTime();
		System.out.println("기존 방법대로 썼을 경우 : "+ (end-start )+" ns.");
	}
}