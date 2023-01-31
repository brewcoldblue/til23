package sandbox;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] fib = new long[N+1];
		fib[0] = 0;
		fib[1] = 1;
		
		for (int i=2; i<N+1; i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		
		System.out.println("문제의 정답");
	}
}