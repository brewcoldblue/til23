package exercise;

import java.util.Scanner;

public class E2_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n 입력");
		int n = sc.nextInt();
		System.out.println("m 입력");
		int m = sc.nextInt();
		System.out.println("배수 m개 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("스위치 상태 출력");
		int[] result = new int[n];
		
		for (int i = 0; i<result.length; i++) {
			if( (i+1) % a == 0 ) {
				if (result[i] == 0) result[i] = 1;
				else result[i] = 0;
			}
			if( (i+1) % b == 0 ) {
				if (result[i] == 0) result[i] = 1;
				else result[i] = 0;
			}
			if( (i+1) % c == 0 ) {
				if (result[i] == 0) result[i] = 1;
				else result[i] = 0;
			}
		}
		
		for (int r : result) System.out.printf("%2d", r);
	}
}
