package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E2_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for( int a : arr ) {
			System.out.printf("%d", a);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		String[] answer = new String[length];
		String input;
		
		for ( int i = 0; i < length; i++) {
			input = sc.next();
			answer[i] = input;
		}
		
		for ( String a : answer ) {
			System.out.println(a);
		}
		System.out.println();
	}
}
