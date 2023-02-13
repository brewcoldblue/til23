package s2068;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		int max = 0;
		for (int i=1; i<=T; i++) {
			for(int j=0; j<10; j++) {
				int[] arr = new int[10];
				arr[j] = sc.nextInt();
				if(arr[j] > max) max = arr[j];
			}
			if(answer < max) answer = max;
			max = 0;
			System.out.println("#"+i+" "+answer);
			answer = 0;
		}
	}
}
