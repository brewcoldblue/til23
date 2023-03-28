package s7733;

import java.util.Scanner;

public class Solution {
	//치즈
	static int[][] cheese;
	//방문체크 배열
	static boolean[][] visited;
	//치즈 사이즈
	static int N;
	//정답
	static int answer;
	//오늘 치즈블록의 갯수
	static int sum;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//테스트 케이스 T만큼 반복
		int T = sc.nextInt();
		
		
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			cheese = new int[N][N];

			//치즈와 가장 맛있는 부분의 입력을 받고
			int max = 0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int input = sc.nextInt();
					cheese[r][c] = input;
					//가장 맛있는 부분 판정(요정이 치즈를 최대 max일만큼 먹을 수 있음)
					max = max < input ? input : max;
				}
			}
			
			//정답 변수
			answer = 0;

			//요정이 치즈의 원소 중 최댓값(일)까지 먹으면 다 먹음
			//이때 치즈를 넣은 당일(X==0)은 안 먹음
			for(int X=0; X<=max; X++) {
				//DFS가 탐색 완료가 되면 덩어리 하나 증가시킴
				//매일매일 초기화되어야 한다
				sum = 0;
				//방문 배열은 매일매일 초기화되어야 한다
				visited = new boolean[N][N];
				
				//지금 탐색한 결과가 치즈블록이 맞는지?
				boolean cheeseblock = false;

				//이차원 배열의 모든 칸에 대해 DFS를 실행하고,
				//치즈블록의 갯수를 셈
				for(int r=0; r<N; r++) {
					for(int c=0; c<N; c++) {
						cheeseblock = DFS(r, c, X);
						if(cheeseblock) sum++;
					}
				}
				
				//치즈블록 최댓값 판정해서 최댓값을 answer에 집어넣음
				answer = answer < sum ? sum : answer;
			}
			
			//정답 출력
			System.out.println("#"+tc+" "+answer);
			
		}
	}
	public static boolean DFS(int r, int c, int day) {
		//도착한 칸이 이미 방문한 칸이거나, 요정이 먹은 부분이라면 더 탐색하지 않고 리턴
		if(cheese[r][c] <= day) return false;
		if(visited[r][c]) return false;
		
		//방문하지 않은 칸이라면 방문표시 후
		visited[r][c] = true;
		
		//인접한 상하좌우의 칸 중에
		for(int i=0; i<4; i++) {
			int[] nr = {r-1, r+1, r, r};
			int[] nc = {c, c, c-1, c+1};
			switch(i) {
			case 0: 
				//배열 범위 안 넘고 && 방문 아직 안 했고 && 요정이 안 먹었으면 탐색함
				if(nr[i] >= 0 && !visited[nr[i]][nc[i]] && cheese[nr[i]][nc[i]] > day) DFS(nr[i], nc[i], day);
				break;
			case 1: 
				if(nr[i] < N && !visited[nr[i]][nc[i]] && cheese[nr[i]][nc[i]] > day) DFS(nr[i], nc[i], day);
				break;
			case 2: 
				if(nc[i] >= 0 && !visited[nr[i]][nc[i]] && cheese[nr[i]][nc[i]] > day) DFS(nr[i], nc[i], day);
				break;
			case 3: 
				if(nc[i] < N && !visited[nr[i]][nc[i]] && cheese[nr[i]][nc[i]] > day) DFS(nr[i], nc[i], day);
				break;
			default: break;
			}				
		}
		//탐색을 더 진행하지 않았더라도 1x1개 또한 치즈블록이어서 무조건 true 리턴
		return true;
	}
}
