package live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prim_PQ {
	static class Edge implements Comparable<Edge>{
		int st, ed, w;

		public Edge(int st, int ed, int w) {
			this.st = st;
			this.ed = ed;
			this.w = w;
		}

		@Override
		public int compareTo(Edge o) {
			//양수면 그대로 있고 음수면 바뀜
			//모르겠으면 Integer.compare(x, y) 써도됨.
//			return this.w - o.w;
			return Integer.compare(this.w, o.w);
		}
		
		static final int INF = Integer.MAX_VALUE;
		
		static int[] p;
		
		static String input = "7 11\r\n" + 
				"0 1 32\r\n" + 
				"0 2 31\r\n" + 
				"0 5 60\r\n" + 
				"0 6 51\r\n" + 
				"1 2 21\r\n" + 
				"2 4 46\r\n" + 
				"2 6 25\r\n" + 
				"3 4 34\r\n" + 
				"3 5 18\r\n" + 
				"4 5 40\r\n" + 
				"4 6 51\r\n" + 
				"\r\n";
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(input);
			
			int V = sc.nextInt(); //정점의 수
			int E = sc.nextInt(); //간선의 수

			//인접행렬
			List<Edge>[] adjList = new ArrayList[V];
			
			for(int i=0; i<V; i++) {
				adjList[i] = new ArrayList<>();
			}
			
			for(int i=0; i<E; i++) {
				
				//시작정점, 도착정점, 가중치
				int A = sc.nextInt();
				int B = sc.nextInt();
				int W = sc.nextInt();
				
				//무향이니까 양쪽에 다 저장해야함
				adjList[A].add(new Edge(A, B, W));
				adjList[B].add(new Edge(B, A, W));
			}

			
			boolean[] visited = new boolean[V];
			
			PriorityQueue<Edge> pq = new PriorityQueue<>();
			
			
			//시작정점 하나 뽑기
			visited[0] = true; //0에서 이어지는 모든 간선 넣고 시작
			
//			for(int i=0; i<adjList[0].size(); i++) {
//				pq.add(adjList[0].get(i));
//			}
//			for(Edge e : adjList[0]) pq.add(e);
			pq.addAll(adjList[0]); //컬렉션을 넣으면 전부 넣어줌
			
			int pick = 1; //확보한 정점의 개수
			int answer = 0;
			
			while(pick != V) {
				Edge e = pq.poll(); //지금 우선순위 큐 안에 들어있는 최선의 값이 들어감.
				if(visited[e.ed]) continue;
				
				answer += e.w;
				pq.addAll(adjList[e.ed]);
				visited[e.ed] = true;
				pick++;
			}
				System.out.println(answer);
			}
	}
}
