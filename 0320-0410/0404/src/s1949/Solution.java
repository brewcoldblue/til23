package s1949;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	
	static int length;
	static int N;
	static int K;
	static int[][] mt;
	static boolean[][] visited;
	static int answer;
	static int count;
	static boolean usedK;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			N = sc.nextInt();
			K = sc.nextInt();
			
			//산
			mt = new int[N][N];
			
			ArrayList<int[]>Pinnacles = new ArrayList<>();
			
			//입력을 받으면서 최댓값 찾기
			int max = 0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int input = sc.nextInt();
					mt[r][c] = input;
					max = max < input ? input : max;
				}
			}
			//최댓값 찾으면서 그 좌표 찾기, 여러 개일 수 있으므로 ArrayList에 집어넣기
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int[] temp = new int[2];
					if(mt[r][c] == max) {
						temp[0] = r;
						temp[1] = c;
						Pinnacles.add(temp);
					}
				}
			}
			
			//정답 변수
			answer = 0;
			//꼭짓점의 수만큼 반복함
			for(int i=0; i<Pinnacles.size(); i++) {
				//카운트, 방문 배열, K 사용 여부는 매 반복시마다 초기화되어야함
				count = 0;
				visited = new boolean[N][N];
				usedK = false;
				//DFS: 꼭짓점의 좌표와 꼭짓점의 높이를 초기값으로 집어넣음
				DFS(Pinnacles.get(i)[0], Pinnacles.get(i)[1], max);
			}
			System.out.println("#"+tc+" "+answer);
			
		}
	}
	
	//최고점부터 시작해 다음 칸이 지금 칸보다 작으면 전진할 수 있습니다
	public static void DFS(int r, int c, int height) {

		//칸에 진입하면 카운트를 더하고, 방문 처리함
		count++;
		visited[r][c] = true;
		
		//델타 탐색과 다음 칸 변수 선언
		int[] nr = {r-1, r+1, r, r};
		int[] nc = {c, c, c-1, c+1};
		int nextHeight;
		boolean nextVisited;
		
		for(int i=0; i<4; i++) {
			if(nr[i] >= 0 && nc[i] >= 0 && nr[i] < N && nc[i] < N) {
				//다음 칸과 다음 방문여부
				nextHeight = mt[nr[i]][nc[i]];
				nextVisited = visited[nr[i]][nc[i]];
				//다음 칸 방문 안했으면
				if(!nextVisited) {
					//1. 다음 칸이 더 낮으면 전진할 수 있음
					if(nextHeight < height) {
					//다음 칸 가서 DFS
					DFS(nr[i], nc[i], nextHeight);
					//2. 다음 칸이 더 높아도, 1번에 한해 K까지는 차이를 메울 수 있음 
					} else if (!usedK && nextHeight-K < height) {
						//K 사용
						usedK = true;
						//다음 칸에 가서 DFS, 이후에는 K를 사용할 수 없음.
						DFS(nr[i], nc[i], height-1);
						//K 미사용 상태로 다시 바꿔 다음 분기에서 다시 K를 사용할 수 있도록 함
						usedK = false;
					}
				}
			}
		}

		//끝까지 탐색했으면 기존에 찍혔던 정답이랑 비교해서 최댓값 갱신
		answer = answer < count ? count : answer;
		
		//여기서 더했던 카운트 다시 빼줘서 다른 분기에서 원래 값을 쓸 수 있게 함
		//방문 취소해서 다시 복구해줘야 다른 분기에서 같은 곳을 또 가볼 수 있음..
		count--;
		visited[r][c] = false;
	}
}
