package b11729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final StringBuilder answer = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		br.close();
			answer.append((1<<k) - 1).append("\n");
			hanoi(1, 3, k);
			System.out.println(answer);
		}
	
	public static void hanoi(int start, int end, int n) {
		if(n==1) {
			answer.append(start).append(" ").append(end).append("\n");
			return;
		}
		//else로 다 빼고 하나씩 출력
		else {
			hanoi(start, 6-start-end, n-1);
			answer.append(start).append(" ").append(end).append("\n");
			hanoi(6-start-end, end, n-1);
		}

	}
}
