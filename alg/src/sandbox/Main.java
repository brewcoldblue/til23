package sandbox;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int cnt = 0;
		for (String i: arr) {
			if(i != "") cnt++;
		}
		System.out.println(cnt);
	}
}