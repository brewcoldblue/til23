package s1984;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int [10];

		for (int i=1; i<=T; i++) {
			for(int j=0; j<10; j++) {
				arr[j] = sc.nextInt();
			}

			int temp = 0;
			for(int j=0; j<10; j++) {
				for(int k=0; k<9-j; k++) {
					if(arr[k] > arr[k+1]) {
						temp = arr[k];
						arr[k] = arr[k+1];
						arr[k+1] = temp;
					} //bubble sort
				}
			}
			System.out.println(Arrays.toString(arr));
			double sum = 0;
			int min = arr[0];
			int max = arr[9];
			int[] range = new int[2];
			for(int j=0; j<10; j++) {
				if(arr[j] == max) {
					range[1] = j;
					break;
				}
			}
			for(int j=0; j<10; j++) {
				if(arr[j] > min) {
					range[0] = j;
					break;
				}
			}
			for(int j=range[0]; j<range[1]; j++) {
				sum += arr[j];
			}
//			for(int j=1; j<9; j++) {
//				sum+=arr[j];
//			}
			double answer = sum/(range[1]-range[0]);
//			double answer = sum/8;
			int result = (int) Math.round(answer);
			System.out.println("#"+i+" "+result);
		}
	}
}
