package s1251;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	static int[] p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int C=1; C<=TC; C++) {
			double money = 0;
			
			int N = sc.nextInt();
			int[][] islands = new int[N][2];
			//섬의 좌표를 받습니다
			//X좌표 입력 쭉받고
			for(int n=0; n<N; n++) {
				islands[n][0] = sc.nextInt();
			}
			//Y좌표 입력 쭉 받음
			for(int n=0; n<N; n++) {
				islands[n][1] = sc.nextInt();
			}
			//세율 받음
			double taxrate = sc.nextDouble();
			//간선들을 모두 저장함... 시작점, 끝점, 가중치(거리의 제곱)를 각각 저장하고
			//갯수는 N(N-1)/2가 될것...
			double[][] edges = new double[N*(N-1)/2][3];
			
			int cnt = 0;
			//무향이므로 모든 간선을 만들 때 
			for(int i=0; i<N; i++) {
				for(int j=i+1; j<N; j++) {
					if(i==j) continue;
					double length = (taxrate * Math.pow((islands[i][0]-islands[j][0]),2)+
								  	 taxrate * Math.pow((islands[i][1]-islands[j][1]),2));
					edges[cnt][0] = i;
					edges[cnt][1] = j;
					edges[cnt][2] = length;
					cnt++;
				}
			}
//			for(long[] arr: edges) {
//				System.out.println(Arrays.toString(arr));
//			}
			Arrays.sort(edges, new Comparator<double[]>() {
				@Override
				public int compare(double[] o1, double[] o2) {
//					if(o1[2]==o2[2]) return (int) (o1[0]-o2[0]);
					if(o1[2] > o2[2]) return 1;
					else if(o1[2] == o2[2]) return 0;
					else return -1;
				}
			}
			);

			p = new int[N];
			for(int i=0; i<N; i++) makeset(i);
			
			int pick = 0;
			for(int i=0; i<N*(N-1)/2; i++) {
				int x = (int) findset((int)edges[i][0]);
				int y = (int) findset((int)edges[i][1]);
				if(findset(x) != findset(y)) {
					union(x,y);
					pick++;
					money += edges[i][2];
				}
				if(pick == (N-1)) break;
			}
			
			
//			money = money * taxrate;
			long answer = Math.round(money);
			System.out.println("#"+C+" "+answer);
		}
	}
	
	static void union(int x, int y) {
		p[findset(y)] = findset(x); //랭크 고려 안하므로 그냥 합침
	}
	static int findset(int x) {
		if(x==p[x]) return x;
		return findset(p[x]);
	}
	static void makeset(int x) {
		p[x] = x;
	}
}
