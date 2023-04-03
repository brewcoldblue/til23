package s5650;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
	
	static int[][]map;
	static HashMap<Integer, int[]> Hole1;
	static HashMap<Integer, int[]> Hole2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int answer = 0;
			
			int N = sc.nextInt();
			map = new int[N][N];
			
			Hole1 = new HashMap<>();
			Hole2 = new HashMap<>();
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int input = sc.nextInt();
					map[r][c] = input;
					
					if(input > 5) {
						//여기서 웜홀 처리 어떻게 해야 (r,c)를 알 때 다른 (r,c)를 빠르게 호출할수 있을까?
						int[] wormhole = {r, c};
						if(Hole1.get(input) != null) Hole2.put(input, wormhole);
						else Hole1.put(input, wormhole);
					}
				}
			}
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(map[r][c] == 0) DFS(r, c, 0);
				}
			}
			
			System.out.println("#"+tc+" "+answer);
		}
	}
	
	public static boolean indexCheck(int r, int c) {
		return r>=0 && r<map.length && c>=0 && c<map.length;
	}
	
	public static void DFS(int r, int c, int d) {
		//base case: 처음 위치로 돌아오는 경우
		//base case: 블랙홀에 빠지는 경우
		
		//recursive case:
		//상, 하, 좌, 우 순서로 탐색합니다
		int[] nr = {r-1, r+1, r, r};
		int[] nc = {c, c, c-1, c+1};
		int nd = d;
			if(indexCheck(nr[d], nc[d])) {
				if(map[nr[d]][nc[d]] > -1) return;
				//웜홀 처리
				if(map[nr[d]][nc[d]] > 5) {
					int[] arr = Hole1.get(map[nr[d]][nc[d]]);
					if(arr[0] == nr[d] && arr[1] == nc[d]) {
						
					}
				}
				switch(map[nr[d]][nc[d]]) {
				case 0: DFS(nr[d],nc[d], d);
						break;
				case 1: {
					if(d == 0) nd = 1;
					else if(d == 1) nd = 3;
					else if(d == 2) nd = 0;
					else if(d == 3) nd = 2;
					DFS(nr[nd],nc[nd],nd);
				};
				case 2:
				case 3:
				case 4:
				case 5:
				}
			}
		}
	}
