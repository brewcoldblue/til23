package live;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Prim {

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
		int[][] adj = new int[V][V];
		
		for(int i=0; i<E; i++) {
			
			//시작정점, 도착정점, 가중치
			int A = sc.nextInt();
			int B = sc.nextInt();
			int W = sc.nextInt();
			
			//무향이니까 양쪽에 다 저장해야함
			adj[A][B] = W;
			adj[B][A] = W;
		}

		boolean[] visited = new boolean[V];
		int[] p = new int[V]; //어디에서 왔는지에 대한 정보를 저장
		int[] dist = new int[V]; //key라고 불렸던 가장 작은값을 저장
		//dist는 매우 큰 값으로 갱신할것
		
//		for(int i=0; i<V; i++) {
//			dist[i] = INF;
//		}		
		Arrays.fill(dist, INF);
		
		//임의의 한 점을 선택해서 돌려야함
		dist[0] = 0; //0번 정점을 가지고 시작할것..
		p[0] = -1;
		int answer = 0;
		
		//프림 알고리즘 동작
		//V번 돌아도 이슈 없고 V-1번 돌아도 됨
		for(int i=0; i<V-1; i++) {
			//1. 가중치가 가장 작은 값을 뽑음
			int min = INF;
			int idx = -1;
			//안 뽑힌 것들 중 가장 작은 값 뽑기
			for(int j=0; j<V; j++) {
				if(!visited[j] && dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			}//idx == 가장 작은 값을 가진 정점
			
			visited[idx] = true; //선택
			
			//2. 뽑은 정점을 이용해 갱신할 수 있는 게 있다면 모조리 갱신
			//인접 행렬이니까 모든 정점 확인
			for(int j=0; j<V; j++) {
				if(!visited[j] && adj[idx][j] !=0 && dist[j] > adj[idx][j]) {
					dist[j] = adj[idx][j];
					p[j] = idx;
				}
			}
		}
			for(int i=0; i<V; i++) {
				answer += dist[i];
			}
			System.out.println(answer);
		}

	
	
	static void union(int x, int y) {
//		p[findset(y)] = findset(x); //랭크 고려 안하므로 그냥 합침
		p[y] = x;
	}
	static int findset(int x) {
//		if(x==p[x]) return x;
//		return findset(p[x]);
		
		//Path Compression
		//이거 한다고 시간복잡도 드라마틱하게 줄지는 않을것
		if(x!=p[x]) p[x] = findset(p[x]);
		return p[x];
	}
	static void makeset(int x) {
		p[x] = x;
	}
	
}
