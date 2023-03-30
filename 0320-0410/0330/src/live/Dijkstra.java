package live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dijkstra {
	
	static class Node {
		//정점, weight
		int v, w;
		public Node(int v, int w) {
			this.v = v;
			this.w = w;
		}
		
	}
	
	static final int INF = Integer.MAX_VALUE;
	static int V, E;
	static List<Node>[] adjList; //인접리스트
	static int[] dist; //최단길이를 저장할 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		E = sc.nextInt();
		
		adjList = new ArrayList[V];
		for(int i=0; i<V; i++) adjList[i] = new ArrayList<>();
		dist = new int[V];
		Arrays.fill(dist, INF);
		
		for(int i=0; i<E; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			//유향그래프!
			
			adjList[A].add(new Node(B, W)); //A라는 점은 B에 연결되어 있고 W라는 가중치를 가짐
		}
		
		dijkstra(0);
		System.out.println(Arrays.toString(dist));
	}
	
	private static void dijkstra(int start) {
		boolean[] visited = new boolean[V];
		dist[start] = 0; //시작 노드에서 시작 노드까지의 거리는 0
		
		for(int i=0; i<V-1; i++) {
			int min = INF;
			int idx = -1;
			
			//선택하지 않은 정점 중 dist가 가장 짧은 것을 고름
			for(int j=0; j<V; j++) {
				if(!visited[j] && min > dist[j]) {
					min = dist[j];
					idx = j;
				}
			}
			if(idx == -1) break; //선택할 수 없으면 멈춥니다
			visited[idx] = true; //선택
			//갱신할 수 있으면 갱신
			for(int j=0; j<adjList[idx].size(); j++) {
				Node cur = adjList[idx].get(j);
				
				//방문하지 않았고, 연결도 되었고(인접행렬이라면 고려해야함),
				//이미 가지고 있는 값보다 더 작은 값이 있다면 갱신
				if(!visited[cur.v] && dist[cur.v] > dist[idx] + cur.w) {
					//프림은 그 간선이 나보다 작으면 그냥 갱신하는데, 다익스트라는 시작정점으로부터의 최단경로를 모두 고려 (여기까지 온 값 + 앞으로 갈 값)
					dist[cur.v] = dist[idx] + cur.w;
				}
			}
		}
		
	}

	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12\r\n" + "";

}
