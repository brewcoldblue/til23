package live;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Kruskal {
	
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

		//0: 시작정점, 1: 끝정점, 2: 가중치
		int[][] edges = new int[E][3];
		
		for(int i=0; i<E; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}

		
		//크루스칼 1단계: 간선 정렬: 가중치 기준
		Arrays.sort(edges,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}	
		});
		
		for(int[] arr: edges) {
			System.out.println(Arrays.toString(arr));
		}
		//크루스칼 2단계: V-1개의 간선을 뽑는데
		//사이클이 발생안하는 간선들로만 뽑는다
		//상호배타집합을 사용해야함
		p = new int[V]; //초기화
			//2-1. make-set
		for(int i=0; i<V; i++) makeset(i);
		 
		int answer = 0;
		int pick = 0; //뽑은 간선의 수
		
		for(int i=0; i<E; i++) {
//			int x = edges[i][0];
//			int y = edges [i][1];
			int x = findset(edges[i][0]);
			int y = findset(edges[i][1]);
			if(findset(x) != findset(y)) {
				union(x,y);
				pick++;
				answer += edges[i][2];
			}
			if(pick == (V-1)) break; //간선 다 뽑았으면 나와
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
