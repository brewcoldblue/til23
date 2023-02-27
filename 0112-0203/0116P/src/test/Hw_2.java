package test;
import java.util.Scanner;
public class Hw_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		for ( ; ; ) {
			System.out.println("숫자를 입력하세요: ");
			a = sc.nextInt();	
			switch (a) {
				case 0: {
					System.out.println("프로그램 종료");
					break;
				}
				default: {
					for(int i = 1; i < 10; i++) {
						System.out.println(a + " * " + i + " = " + a*i);
					}
				}
			}
		}
	}
}
