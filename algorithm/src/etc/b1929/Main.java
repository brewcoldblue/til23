package etc.b1929;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[] arr = new int[N-M+1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = M+i; //숫자 배열에 집어넣기
		}
		
		for(int i=0; i<arr.length; i++) {
			int flag = 0;
			
			for(int j=1; j<=Math.sqrt(arr[i]); j++) {
				if(arr[i]%j == 0) flag++; //소수인지 판별
			}
			
			if(flag == 1) System.out.println(arr[i]);
		} //왜 초과????? 왜????????
		
	}
}
