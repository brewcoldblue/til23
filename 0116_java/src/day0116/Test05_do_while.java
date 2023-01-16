package day0116;

import java.util.Scanner;

public class Test05_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1을 입력받으면 계속 반복하고, 그 외 값으면 종료하도록 하기
		int num = sc.nextInt();
		do {
			System.out.println("블록을 실행합니다. 첫 번째에 한해서는 참이든 거짓이든 무조건 실행합니다.");
			num = sc.nextInt();
		} while (num == 1);
	}
}
