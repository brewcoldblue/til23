package a1110;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int T = input;
		int count = 0;
			do {
				int head = T/10;
				int tail = T%10;
				int sum = head + tail;
				count++;
				T = 10 * tail + sum%10;
			} while (input != T);
			System.out.println(count);
	}
}