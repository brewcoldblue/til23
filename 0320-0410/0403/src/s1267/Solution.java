package s1267;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	static Queue<Integer> Q;
	static Queue<Integer> A;
	static int[][] adj;
	static int[] in_degree;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스는 10개로 고정
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			
			//정점 수와 간선 수를 입력받음
			int V = sc.nextInt();
			int E = sc.nextInt();
			
			//인접행렬: 정점 수 + 1만큼 인덱스를 주어 1번부터 V번까지 쓸 수 있도록 함
			adj = new int[V+1][V+1];
			//전체 정점의 진입차수 관리용 배열
			in_degree = new int[V+1];
			
			//간선 입력: out - in 순서로 입력받음
			//진입차수도 같이 입력받음
			for(int i=0; i<E; i++) {
				int outd = sc.nextInt();
				int ind = sc.nextInt();
				adj[outd][ind] = 1;
				in_degree[ind] += 1;
			}

			//위상정렬을 위한 큐 Q, 정답 출력을 위한 큐 A
			Q = new LinkedList<>();
			A = new LinkedList<>();
			
			//진입차수가 0인 정점을 큐에 먼저 추가
			for(int i=1; i<V+1; i++) {
				if(in_degree[i] == 0) Q.add(i);
			}
			
			//큐가 빌 때까지, 큐에서 정점을 하나씩 빼면서 뺀 정점을 정답 큐에 추가
			//해당 정점의 진출차수를 살피면서 만약 진출하는 간선이 있다면
			//해당 간선 제거(진입차수에서 해당 인덱스에 해당하는 값 -1)
			//만약 간선을 제거했는데 진입차수가 0이 된다면 인접한 것이므로, 큐에 새로 추가
			while(!Q.isEmpty()) {
				int cur = Q.poll();
				A.add(cur);
				for(int i=1; i<adj[cur].length; i++) { //진출차수
					if(adj[cur][i] == 0) continue;
					in_degree[i] -= 1; //해당 인덱스로 진입하는 게 있으면 간선 삭제
					if(in_degree[i] == 0) Q.add(i);
				}
			}
			//정답 출력
			System.out.print("#"+tc);
			while(!A.isEmpty()) System.out.print(" "+(A.poll()));
			System.out.println();
		}
	}
}
