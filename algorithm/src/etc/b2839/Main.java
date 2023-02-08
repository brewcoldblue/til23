package etc.b2839;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int q3 = N/3;
		int r3 = N%3;
		int q5 = N/5;
		int r5 = N%5;
		double[] arr = new double[1];
		
		for (int i = 1; i<=q5; i++) {
			if((N - 5*i)%3 == 0) {
				arr[0] = (double) i+(N - 5*i)/3;
			}
		} // q5로 나뉜 값을 빼면 q3으로 나눌 쑤 있는 경우
		
		if(arr[0] == 0) {
			if(r3 != 0) arr[0] = -1;
			else arr[0] = q3;
		}
		System.out.println(arr[0]);
	}
}
