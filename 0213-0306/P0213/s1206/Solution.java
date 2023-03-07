package s1206;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//앞의 두 수와 뒤의 두 수가 나보다 작아야 한다.
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int j=0; j<N; j++) {
				arr[j] = sc.nextInt();
			} //숫자 넣기..
			int count = 0;
			for (int j=2; j<N-2; j++) {
				if(arr[j-2] < arr[j] &&
				   arr[j-1] < arr[j] &&
				   arr[j] > arr[j+1] &&
				   arr[j] > arr[j+1]) {
						int[] arr2 = new int [5];
						arr2[0] = arr[j-2];
						arr2[1] = arr[j-1];
						arr2[2] = arr[j];
						arr2[3] = arr[j+1];
						arr2[4] = arr[j+2];
						Arrays.sort(arr2);
						count += arr[j]-arr2[3];
				}
			}
			System.out.println("#"+i+" "+count);
		}
	}
}
