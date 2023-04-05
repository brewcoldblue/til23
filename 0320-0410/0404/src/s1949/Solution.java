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
			
			//��
			mt = new int[N][N];
			
			ArrayList<int[]>Pinnacles = new ArrayList<>();
			
			//�Է��� �����鼭 �ִ� ã��
			int max = 0;
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int input = sc.nextInt();
					mt[r][c] = input;
					max = max < input ? input : max;
				}
			}
			//�ִ� ã���鼭 �� ��ǥ ã��, ���� ���� �� �����Ƿ� ArrayList�� ����ֱ�
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
			
			//���� ����
			answer = 0;
			//�������� ����ŭ �ݺ���
			for(int i=0; i<Pinnacles.size(); i++) {
				//ī��Ʈ, �湮 �迭, K ��� ���δ� �� �ݺ��ø��� �ʱ�ȭ�Ǿ����
				count = 0;
				visited = new boolean[N][N];
				usedK = false;
				//DFS: �������� ��ǥ�� �������� ���̸� �ʱⰪ���� �������
				DFS(Pinnacles.get(i)[0], Pinnacles.get(i)[1], max);
			}
			System.out.println("#"+tc+" "+answer);
			
		}
	}
	
	//�ְ������� ������ ���� ĭ�� ���� ĭ���� ������ ������ �� �ֽ��ϴ�
	public static void DFS(int r, int c, int height) {

		//ĭ�� �����ϸ� ī��Ʈ�� ���ϰ�, �湮 ó����
		count++;
		visited[r][c] = true;
		
		//��Ÿ Ž���� ���� ĭ ���� ����
		int[] nr = {r-1, r+1, r, r};
		int[] nc = {c, c, c-1, c+1};
		int nextHeight;
		boolean nextVisited;
		
		for(int i=0; i<4; i++) {
			if(nr[i] >= 0 && nc[i] >= 0 && nr[i] < N && nc[i] < N) {
				//���� ĭ�� ���� �湮����
				nextHeight = mt[nr[i]][nc[i]];
				nextVisited = visited[nr[i]][nc[i]];
				//���� ĭ �湮 ��������
				if(!nextVisited) {
					//1. ���� ĭ�� �� ������ ������ �� ����
					if(nextHeight < height) {
					//���� ĭ ���� DFS
					DFS(nr[i], nc[i], nextHeight);
					//2. ���� ĭ�� �� ���Ƶ�, 1���� ���� K������ ���̸� �޿� �� ���� 
					} else if (!usedK && nextHeight-K < height) {
						//K ���
						usedK = true;
						//���� ĭ�� ���� DFS, ���Ŀ��� K�� ����� �� ����.
						DFS(nr[i], nc[i], height-1);
						//K �̻�� ���·� �ٽ� �ٲ� ���� �б⿡�� �ٽ� K�� ����� �� �ֵ��� ��
						usedK = false;
					}
				}
			}
		}

		//������ Ž�������� ������ ������ �����̶� ���ؼ� �ִ� ����
		answer = answer < count ? count : answer;
		
		//���⼭ ���ߴ� ī��Ʈ �ٽ� ���༭ �ٸ� �б⿡�� ���� ���� �� �� �ְ� ��
		//�湮 ����ؼ� �ٽ� ��������� �ٸ� �б⿡�� ���� ���� �� ���� �� ����..
		count--;
		visited[r][c] = false;
	}
}
