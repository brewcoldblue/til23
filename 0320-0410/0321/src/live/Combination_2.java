package live;

import java.util.Arrays;

public class Combination_2 {
	static String[] 토핑 = {"상추", "패티", "토마토", "치즈"};
	static int N = 4;
	static int R = 2;
	
	static String[] sel = new String[R];
	
	public static void main(String[] args) {
		//1, 2, 3, 4 중 3개를 뽑는 상황을 가정
		//경계만 잘 설정하면 for문 3개로 처리할 수 있다.
//		int[]arr = {1, 2, 3, 4};
//		for(int i=0; i<2; i++) {
//			for(int j=i+1; j<3; j++) {
//				for(int k=j+1; k<4; k++) {
//					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//				}
//			}
//		}
		//경계값은 사실  N - R + (sidx) 이다. 여기서 sidx는 반복문이 이전까지 쓰인 횟수. 
		
		combination(0,0); //이걸 재귀로 만들면 이렇게 됨
		
		/* combination(3,2) [패티, 토마토] return
		 * combination(2,1) 
		 * combination(0,0) [패티, ]
		 * main
		 * 
		 * combination(4,2) [상추, 치즈] return
		 * combination(1,1)
		 * combination(0,0) [상추,
		 * main
		 * 
		 * combination(3,2) [상추, 토마토] return
		 * combination(1,1) 
		 * combination(0,0) [상추, ]
		 * main
		 * 
		 * combination(2,2) [상추, 패티] return;
		 * combination(1,1) 패티, 토마토, 치즈 고려 [상추, ]
		 * combination(0,0) 상추, 패티, 토마토 고려 [상추, ]
		 * main
		 * */
	}
	public static void combination(int idx, int sidx) {
		if(sidx == R ) {
			System.out.println(Arrays.toString(sel));
			return;
		}
		
		for(int i = idx; i<=N-R+sidx; i++) {
			sel[sidx] = 토핑[i];
			combination(i+1, sidx+1);
		}
	}
}
