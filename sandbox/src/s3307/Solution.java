package s3307;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			
			for (int test_case = 1; test_case<=T; test_case++) {
				int N = sc.nextInt();
				int[] arr = new int[N];
				int[][] counts = new int[N][N];
				for (int i=0; i<N; i++) {
					arr[i] = sc.nextInt();
				}
				int target = -1;
				int target2 = -1;
				int curr = 0;
				for (int i=0; i<N; i++) {
					target = arr[i];
					target2 = arr[i];
					for (int j=0; j<N; j++) { //반복문 2번 돌면서 타겟과 배열의 다음 요소 비교
						if(i<j && target <= arr[j]) { //수열 B가 증가하면서, 수열 A가 증가하면
							target=arr[j]; //타겟을 변경하고
							curr++; //현재 길이 카운트를 1 증가시킨다
							counts[i][j] = curr;
						}
						if(i<j && target > arr[j]) {
							target=arr[j];
							curr=1;
							counts[i][j] = curr;
						}
						//루프 계속 돌면서 판단
					}

					curr=1; // 다시 루프를 돌기 위해 카운트를 초기화한다
				}
				System.out.println(Arrays.toString(counts[1]));
//				System.out.println("#"+test_case+" "+count); //출력.
			}
		}
	}

