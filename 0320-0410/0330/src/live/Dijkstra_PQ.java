package live;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import live.Dijkstra.Node;

public class Dijkstra_PQ {
	
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
	
	
	private static void dijkstra(int start, int end) {
		//prim과 유사할 것이지만 pick할 때 addAll을 하는 게 아니고?
		//갱신한 값을 만들어서 새로운 Node를 넣어야함
		boolean[] visited = new boolean[V];
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
//		pq.addAll(adjList[start]);
		pq.add(new Node(start, 0));
		dist[start] = 0;
		
		int pick = 1;
		int answer = 0;
		
		while(pick != end) {
			Node n = pq.poll();
			if(visited(n.v)) continue;
			
			visited[n.v]= true;
			
			for (Node cur : adjList[n.v]) {
				if (visited[cur.v]) continue;
				if (distance[cur.v] > distance[n.v] + cur.w) {
					distance[cur.v] = distance[n.v] + cur.w;
					pq.offer(new Node(cur.v, distance[cur.v]));
				}
			}
			
//			FOR(){
//			dist[다음노드까지의 거리] = Math.min(dist[다음노드까지의 한큐에 가는거리],dist[n.v] + adjList[n.v]??? 어떻게 들고와야 다음 node weight이 나오지;;)
//			pq.offer(new Node(k, dist[다음노드까지의 거리]));
//			}
			
					
					// 시작에서 K까지  > 현재 dist =   + (n에서 K까지 weight)
			// 시작에서 K까지 = 현재 dist = n.w + (n에서 K까지 weight)
			// pq.offer(new Node (k, 시작에서K까지))
			
			//c는 b, e로 갈수 있음
			//
			
			
			pick++;
		}
	}

	static String input = "6 11\r\n" + "0 1 4\r\n" + "0 2 2\r\n" + "0 5 25\r\n" + "1 3 8\r\n" + "1 4 7\r\n"
			+ "2 1 1\r\n" + "2 4 4\r\n" + "3 0 3\r\n" + "3 5 6\r\n" + "4 3 5\r\n" + "4 5 12\r\n" + "";
}
