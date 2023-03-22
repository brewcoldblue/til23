package s5658;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			
			//N,K값 받고 입력 받기
			int N=sc.nextInt();
			int K=sc.nextInt();
			
			//어쨌든 4조각으로 자르니까...
			int unit = N/4;
			

			//입력을 받아 문자열 배열로 만듭니다.
			String input = sc.next();
			String[] arr = input.split("");
			
			//한 글자씩 큐에 집어넣습니다
			Queue<String> Q = new LinkedList<>();
			for(String c : arr) Q.add(c);
			
			//16진수 코드를 작성할 배열 하나와
			String[] answers = new String[N];
			//16진수를 int로 바꿀 배열 하나를 선언합니다.
			//N<=28에서 2^4(N/4)이 최댓값이므로 모든 값은 int범위 안에 든다고 판단했습니다.
			//총 N-1번 rotate하게 되고, 그에 따라 N개의 값이 생성됩니다
			int[] decoded = new int[N];
			
			// N개의 값을 생성합니다
			for(int i=0; i<N; i++) {
				//초기값의 경우 0x를 붙여 16진수 코드임을 알게 합니다
				if(answers[i] == null) answers[i] = "0x";
				//N/4개씩 문자열을 붙입니다. 이때 큐에서 하나씩 빼서
				//뒤에 붙이면서 문자를 쌓습니다.
				for(int j=0; j<unit; j++) {
					String polled = Q.poll();
					answers[i] += polled;
					Q.add(polled);
				}
				//문자가 다 쌓이면 decode합니다.
				decoded[i] = Integer.decode(answers[i]);
				//4조각으로 자른 다음, 값 하나를 앞에서 빼서 뒤에 넣어줘서
				//로테이션시킵니다.
				if(i%4 == 3) {
					String rotate = Q.poll();
					Q.add(rotate);

				}
			}
			
			//정렬합니다
			Arrays.sort(decoded);
			
			//K번째로 큰 수를... 찾기 위해...
			int answer = 0;
			int count = K;
			//좀 추하지만... ㅎㅎㅎㅎ 뒤부터 탐색해서
			//중복되는 수가 있으면 pass, 없으면 그 값을 할당합니다
			for(int i=N-1; i>=0; i--) {
				if(answer == decoded[i]) continue;
				if(count == 0) break;
				answer = decoded[i];
				count --;
			}

			System.out.println("#"+tc+" "+answer);
		}
	}
}
