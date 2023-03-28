package s2383;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			
			int[][] floor = new int[N][N];
			int r1 = -1, c1 = -1, s1 = -1, r2 = -1, c2 = -1, s2 = -1;
			//r1, c1, s1은 각각 첫 번째 계단의 r, c좌표와 계단의 길이를 의미합니다
			//r2, c2, s2은 각각 두 번째 계단의 r, c좌표와 계단의 길이를 의미합니다
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					int input = sc.nextInt();
					floor[r][c] = input;
					//계단의 좌표와 값을 받아옵니다
					if(input > 1) {
						if(r1 == -1) {
						r1 = r;
						c1 = c;
						s1 = input;
						} else {
							r2 = r;
							c2 = c;
							s2 = input;
						}
					}
				}
			}
			PriorityQueue<Integer> Q1 = new PriorityQueue<>();
			PriorityQueue<Integer> Q2 = new PriorityQueue<>();
			Queue<Integer> S1 = new LinkedList<>();
			Queue<Integer> S2 = new LinkedList<>();
			
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(floor[r][c] == 1) {
						int dist1 = Math.abs(r1-r)+Math.abs(c1-c);
						int dist2 = Math.abs(r2-r)+Math.abs(c2-c);
						System.out.println(dist1+" "+dist2);
						//ㅋㅋㅋ 이렇게 해도 안되네...
						//거리+계단 타고 내려가는 시간 비교해서 계단 1이 더 가까우면 Q1에 계단1까지 가는 데 걸리는 시간을 집어넣고
						if(dist1+s1 < dist2+s2) {
							Q1.add(dist1);
						//계단2가 더 가까우면 Q2에 계단2까지 가는 데 걸리는 시간을 집어넣습니다
						} else if(dist1+s1 > dist2+s2) {
							Q2.add(dist2);
						//만약 같으면... 둘의 사이즈를 보고 더 작은 쪽에 배정합니다
						} else {
							if (Q1.size() <= Q2.size()) Q1.add(dist1);
							else Q2.add(dist1);
						}
					}
				}
			}
			while(!Q1.isEmpty()) {
				//두 개의 큐에서 사람을 하나씩 빼면서
				//계단에 집어넣어야 하는데 어케하지 ㅎㅎ 몰겟다
				System.out.println(Q1.poll());
			}
			System.out.println("----------");
			while(!Q2.isEmpty()) {
				//두 개의 큐에서 사람을 하나씩 빼면서
				//계단에 집어넣어야 하는데 어케하지 ㅎㅎ 몰겟다
				System.out.println(Q2.poll());
			}
		}
	}
}
