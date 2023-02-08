//별 찍기 - 4
package etc.b2441;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >= 1; j--) {
				if(a-j < i-1) System.out.printf("z");
				else System.out.printf("*");
			}
			System.out.println();
		}
}
}