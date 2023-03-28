package live;

import java.util.LinkedList;
import java.util.Queue;

public class 그래프02_BFS {
	static int N = 7;
	//인접행렬
	static int[][] adj = { 
			{ 0, 1, 1, 0, 0, 1, 0 }, 
			{ 1, 0, 0, 1, 0, 0, 1 }, 
			{ 1, 0, 0, 1, 0, 0, 0 },
			{ 0, 1, 1, 0, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1, 1 },
			{ 1, 0, 0, 0, 1, 0, 0 }, 
			{ 0, 1, 0, 1, 1, 0, 0 } };
	static boolean[] visited = new boolean[N];
	static Queue<Integer> Q = new LinkedList<>();
	public static void main(String[] args) {
		BFS(0);
	}
	static void BFS(int v) {
		Q.add(v);
		visited[v] = true;
		while(!Q.isEmpty()) {
			int cur = Q.poll(); //정점을 하나 꺼내고
			System.out.println(cur+"->");
			//연결되어 있으면서 방문하지 않은 곳들을 Q에 넣음
			for(int i=0; i<adj.length; i++) {
				if(!visited[i] && adj[cur][i] == 1) {
					Q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}