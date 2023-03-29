package s3289;

import java.util.Scanner;

public class Solution {
	//static으로 집합을 표현할 배열 생성
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			
			//집합 원소갯수와 연산의 수
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			//원소는 1번부터 N번까지라서 N+1로 초기화
			arr = new int[N+1];
			for(int i=1; i<N+1; i++) {
				//i번 인덱스의 대표는 i
				arr[i] = i;
			}
			//print가 좀 조잡ㅎㅎ
			System.out.print("#"+tc+" ");
			for(int m=0; m<M; m++) {
				//연산종류, 피연산자 두개
				int exec = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				//0은 합집합이므로 union
				if(exec == 0) {
					union(a, b);
				}
				//1은 그 집합에 원소가 있는지 확인하는 것이므로 findSet
				else if(exec == 1) {
					//대표가 같으면 같은 집합
					if(findSet(a) == findSet(b)) System.out.print("1");
					//아니면 0
					else System.out.print("0");
				} else ;
			}
			System.out.println();
		}
	}
	
	//findset, union 그대로 구현함
	public static int findSet(int a) {
		//대표값이 다르면 루트를 죄다 대표값으로 연결함
		if (a != arr[a]) arr[a] = findSet(arr[a]);
		//대표값 리턴
		return arr[a];
	}
	//b의 대표값을 a의 대표값으로 함
	public static void union(int a, int b) {
		arr[findSet(b)] = findSet(a);
	}
}
