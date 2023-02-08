package etc.s5215;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
	
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N=sc.nextInt();
			int L=sc.nextInt();
			
			int[] SCO = new int[N+1];
			int[] KAL = new int[N+1];
			double[] DIV = new double[N+1];
			int[] ANS = new int[N+1];
			
				for(int j=1; j<=N; j++) 
				{
				int S = sc.nextInt();
				int K = sc.nextInt();
				SCO[j] = S;
				KAL[j] = K;
				DIV[j] = (double) S/K;
				}
			
			System.out.println(Arrays.toString(SCO));
			System.out.println(Arrays.toString(KAL));
			System.out.println(Arrays.toString(DIV));
			
			for(int j=1; j<=N; j++) {
				for(int k=1; k<=N; k++) {
					if(j == k) break;
					int A = SCO[j]+SCO[k];
					int B = KAL[j]+KAL[k];
					
				}
			}
			
		}
	}
}
