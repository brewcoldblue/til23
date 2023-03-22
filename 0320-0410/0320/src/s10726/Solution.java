package s10726;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			String answer = "OFF";
			
			//끝 N개의 비트가 켜져 있으면, 그 합은 (2^N) - 1입니다.
			//즉 어떤 수를 2^N으로 나눴을 때 나머지가  (2^N) - 1이 된다면, 끝 N개의 비트가 켜져있다는 뜻입니다.
			if(M%(Math.pow(2, N)) == Math.pow(2, N)-1) answer = "ON";
			
			System.out.println("#"+tc+" "+answer);
		}
	}
}
