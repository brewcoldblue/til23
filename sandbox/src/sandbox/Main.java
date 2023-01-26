package sandbox;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = 9;
		int count = 0;
		
		if (N>=100) {
		for(int k=100; k<=N; k++) {
			String[] arr = Integer.toString(k).split("");
			for (int i=1; i<arr.length - 1; i++) {
				int flag = 0;
				
				int a2 = Integer.parseInt(arr[1]);
				int a1 = Integer.parseInt(arr[0]);
				int d = a2 - a1;
				
				int aN1 = Integer.parseInt(arr[i+1]);
				int aN = Integer.parseInt(arr[i]);

				if( aN1 - aN == d ) {
					flag++;
				}

				if( flag == arr.length - 2 ) {
					count++;
				}
				
			}
		}
		count = count+99;
		} else count=N;
		System.out.println(count);
	}
}