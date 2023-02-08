package etc.b1003;

import java.util.Scanner;
public class Main {
	public static int zeros = 0;
	public static int ones = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int N = sc.nextInt();
			fibonacci(N);
			System.out.println(zeros+" "+ones);
			zeros = 0;
			ones = 0;
		} //아 이건 또 왜 초과
	}
	public static int fibonacci(int n) {
	    if (n == 0) {
	        zeros++;
	        return 0;
	    } else if (n == 1) {
	        ones++;
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
}
