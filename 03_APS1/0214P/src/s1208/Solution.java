package s1208;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10; //
		for(int k=1; k<=T; k++) {
			int[] arr = new int[100]; //가로 길이
			int N = sc.nextInt(); //덤프 횟수 제한
			for(int j=0; j<100; j++) {
				arr[j] = sc.nextInt(); //상자 높이를 받아옵니다.
			}
			int result = dump(N, arr);

			System.out.println("#"+k+" "+result);
		}
	}
	
	public static int dump(int N, int[]buildings) { //가능 횟수랑 배열을 받아옴
		int D = N - 1; //1번 실행
		int[] arr = buildings;
		int min = arr[0];
		int minIdx = 0;

		//최솟값과 최댓값을 찾습니다.
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
				minIdx = i;
			}
		}
		int max = arr[0];
		int maxIdx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i]; 
				maxIdx = i;
			}
		}

		//덤프합니다.
		//최댓값에서 1을 빼고, 최솟값에 1을 더한 후 배열에 저장합니다.
		max = max - 1;
		min = min + 1;
		arr[maxIdx] = max;
		arr[minIdx] = min;
		
		//그 이후에 최솟값과 최댓값을 다시 찾습니다.
		int result_min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= result_min) {
				result_min = arr[i];

			}
		}
		int result_max = arr[0];

		for(int i=0; i<arr.length; i++) {
			if(arr[i] >= result_max) {
				result_max = arr[i]; 
			}
		}
		//덤프 수행 횟수가 남았지만 낙차가 없거나 1이면 그 값을 바로 리턴하고
		if(result_max - result_min == 0 || result_max - result_min == 1) return result_max - result_min;
		//덤프 수행 횟수를 다 소진했으면 남은 최대 낙차를 리턴합니다
		else if (D == 0) return result_max - result_min;
		//덤프 수행 횟수가 남아있으면, 이전 자료를 가지고 한번 더 실행합니다.
		else return dump(D, arr);
	}
}
