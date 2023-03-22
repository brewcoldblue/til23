package live;

import java.util.Arrays;

public class Powerset {
	static String[] 재료 = {"참치", "우엉", "삼겹살"};
	static int N=3;
	static boolean[] sel = new boolean[N];
	public static void main(String[] args) {
		//반복문으로 부분집합 구하기

		int[] selected = new int[N];
		//N의 갯수만큼 반복문 필요
		System.out.println("반복문으로 부분집합 구하기");
		for(int i=0; i<2; i++) {
			selected[0] = i;
			for(int j=0; j<2; j++) {
				selected[1] = j;
				for(int k=0; k<2; k++) {
					selected[2] = k;
					System.out.println(Arrays.toString(selected));
				}
			}
		}
		
		System.out.println("비트마스킹으로 부분집합 구하기");
		//비트마스킹으로 부분집합 구하기
		/* 위의 결과를 비트로 바꿔보면
		 * [0, 0, 0] = 000 = 0
		 * [0, 0, 1] = 001 = 1
		 * [0, 1, 0] = ... = 2
		 * [0, 1, 1] = 3
		 * [1, 0, 0] = 4
		 * [1, 0, 1] = 5
		 * [1, 1, 0] = 6
		 * [1, 1, 1] = 7
*/
//						1<<N == Math.pow(2, N)
		for(int i=0; i<(1<<N); i++) {
			//i가 부분집합 중 하나지만, 어떤 원소를 가진 부분집합인지는 모르는 상태
			//N개의 비트를 확인해보면서, 각 자리가 0인지 1인지 보면 되지 않나.
			//001, 010, 100과 i를 비트 연산하면서 확인하면 된다.
			//이건 001을 각각 0번, 1번, 2번 shift한 것이므로 
			//111로 하면 왜 안됨? 그러면 뭐가 들어있는지를 특정할 수 없다.
			String tmp="";
			for(int j=0; j<N; j++) {
				if((i & (1<<j)) != 0) {// == 1 하면 틀림!!!!! 101 & 100 해서 100 나오면 이건 4임.
				//i의 j번째 비트에 해당 값이 있는지 체크함
					tmp+=재료[j];
				}
			}
			System.out.println(tmp);
		}
		
		System.out.println("\n재귀호출로 부분집합 구하기");
		//재귀호출로 부분집합 구하기
		//재귀호출로 메서드를 작성할 때 최대한 파라미터를 심플하게 하고,
		//뺄 수 있는 경우는 static으로 빼자...

		powerset(0);
		/*
		 * powerset(3)      idx==3 (76) return (82)
		 * powerset(2)      T T T  (86)
		 * powerset(1)      T T F  (86)
		 * powerset(0)      T F F
		 * main        */
		/* 
		 * 위의 상황 이후 powerset(2)의 86번째 줄을 실행한 직후로 돌아와서, 그 다음 줄에 의해 powerset(2)에서 T T F가 됨 (재귀반복)
		 * */
	}
	//idx를 통해 현재 내가 해당 원소를 포함할지 안할지를 결정해야 함

	public static void powerset(int idx) {
		//base case : 재귀를 빠져나갈 수 있는 조건
		//모든 재료에 대한 판단 끝
		if(idx == N) {
			String tmp2 = "";
			for(int i=0 ;i<N; i++) {
				if(sel[i]) tmp2+=재료[i];
			}
			System.out.println(tmp2);
			return;
		}
		//recursive case : 나 자신을 다시 호출하는 조건
		sel[idx] = true; //idx번째의 재료를 사용하였음
		powerset(idx+1); //다음 재료 봐
		
		sel[idx] = false;//idx번째의 재료를 사용하지 않음
		powerset(idx+1); //다음 재료 봐
		//재귀에서 리턴은 현재 메서드를 콜했던 그 지점으로 돌아가는 것이다. 
		//이런 식으로 상태들이 계속 분기하는 것을 상태공간트리라고 함
	}
}
