package s2063;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		} //숫자 받아서 집어넣기
		
		//selection sort 안보고 구현해보기
		for(int i=0; i<N-1; i++) { // 최대 n-1개의 pass
			int idx = i;
			for(int j=i+1; j<N; j++) { // 처음 값 제외하고 나머지 배열 비교
				if(arr[idx] > arr[j]) idx = j;
			}
				int temp = arr[idx];
				arr[idx] = arr[i];
				arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[N/2]);
	}
}
