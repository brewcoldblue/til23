package etc.b22942;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] x = new int[T];
		int[] r = new int[T];
		for (int i=0; i<T; i++) {
			int N = sc.nextInt();
			x[i] = N;
			int R = sc.nextInt();
			r[i] = R;
		}
		L1:
		for (int i=0; i<T; i++) {
			int L1 = x[i]-r[i];
			int R1 = x[i]+r[i];
			
			L2:
			for (int j=0; j<T; j++) {
				int L2 = x[j]-r[j];
				int R2 = x[j]+r[j];
				
				if(i==j) break L2;
				if(((L2<=L1 && R2<=R1) || ( R2 <= R1 && L2 <= R1)) ||
				   ((L1<=L2 && R1<=R2) || ( R1 <= R2 && L1 <= R2))) { //2번 만나는 경우
					System.out.println("NO");
					break L1;
				}
				if((L1 == L2 || L1 == R2 || R1 == R2 || L2 == R1)) { //1번 만나는 경우
					System.out.println("NO");
					break L1;
				}
			}
		if(i == T-1) System.out.println("YES");
		}
	}
}
