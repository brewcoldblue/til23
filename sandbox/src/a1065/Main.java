package a1065;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			String S = sc.next();
			String[] arr = S.split("");
			for (int j=0; j<arr.length; j++) {
				for(int k=0; k<N; k++) {
					System.out.print(arr[j]);
				}
			}
		}
	}
}
