package etc.b1463;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int cnt = 0;
		while (X != 1) {
			if(X%3==1) {
				X=X-1;
				cnt++;
			} else if(X%3==0) {
				X=X/3;
				cnt++;
				System.out.println(X);
			} else if(X%2==0) {
				X=X/2;
				cnt++;
				System.out.println(X);
			} else {
				X=X-1;
				cnt++;
				System.out.println(X);
			}
			
		}
		System.out.println(cnt);
	}
}