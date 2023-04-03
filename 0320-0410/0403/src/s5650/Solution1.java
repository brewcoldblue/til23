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
		
		//�׽�Ʈ ���̽�
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
						//���⼭ ��Ȧ ó�� ��� �ؾ� (r,c)�� �� �� �ٸ� (r,c)�� ������ ȣ���Ҽ� ������?
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
		//base case: ó�� ��ġ�� ���ƿ��� ���
		//base case: ��Ȧ�� ������ ���
		
		//recursive case:
		//��, ��, ��, �� ������ Ž���մϴ�
		int[] nr = {r-1, r+1, r, r};
		int[] nc = {c, c, c-1, c+1};
		int nd = d;
			if(indexCheck(nr[d], nc[d])) {
				if(map[nr[d]][nc[d]] > -1) return;
				//��Ȧ ó��
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
