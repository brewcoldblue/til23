package s1204;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int[] arr = new int[101];
			int value = 0;
			int idx = 0;
			for(int j=0; j<1000; j++) {
				arr[sc.nextInt()]++;
			}
			for(int j=0; j<101; j++) {
				if(arr[j] >= value) {
					value = arr[j];
					idx = j;
				}
			}
			System.out.println("#"+i+" "+idx);
		}
	}
}
