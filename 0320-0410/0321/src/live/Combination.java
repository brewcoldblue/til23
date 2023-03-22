package live;

import java.util.Arrays;

public class Combination {
	
	//재귀로 조합 만들기
	static String[] 토핑 = {"상추", "패티", "토마토", "치즈"};
	static int N = 4; //4개 중에
	static int R = 2; //2개 뽑기 (문제에서 주어짐!)
	
	static String[] sel = new String[R];
	
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * combination(3,2) -- 37 return
		 * combination(2,1) -- 44 [상추 토마토] -> 45
		 * combination(1,1) -- 46(A)
		 * main
		 * 
		 * combination(2,2) -- 37 return -> 46(A) 
		 * combination(1,1) -- 44 [상추, 패티] -> 45
		 * combination(0,0) -- 44 [상추] -> 45
		 * main
		*/
		combination(0,0);
	}
	
	//끝까지 다 봐도 끝나는거지만
	//R개를 뽑는 순간에도 끝나므로, 지금까지 몇개 골랐는지를 들고다니면서 판단해야 함(sidx)
	public static void combination(int idx, int sidx) {
		//base case
		if(sidx == R || idx == N) { // R을 무조건 먼저 고려해야한다! 안그러면...
			if(sidx == R) System.out.println(Arrays.toString(sel));
			return;
		}
		
		//고려를 다 했거나, R개를 뽑은 경우 return
		
		
		//recursive case
		sel[sidx] = 토핑[idx];
		combination(idx+1, sidx+1); //이번 재료 썼고, 다음 재료 판단
		combination(idx+1, sidx); //이번 재료 안 썼고, 다음 재료 판단
	}
	
}
