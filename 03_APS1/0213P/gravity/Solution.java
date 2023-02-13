package gravity;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 1; //테스트 케이스의 개수
		int V = 8; //vertical
		int H = 9; //horizontal
		int[] arr = new int[H];
		
		int answer = 0;
		int max = 0;
		
		for (int j=0; j<V; j++) { //세로 길이
			for (int i = 0; i<H; i++) { //가로 길이
				
				//뒤집었을 때의 최대 낙차를 곱해서 넣습니다(세로 길이 - 1 - i, 층수 - 1)
				//즉 밑에 아무것도 없다고 생각했을 때 최대가 되는 낙차를 곱해서 각 층에 넣습니다.
				arr[i] = sc.nextInt()*(H-1-i);
				
				//변수 max에 최댓값을 넣습니다.
				//arr[i]는 뒤로 갈수록 작아지기 때문에 처음에 들어온 값이 무조건 최댓값입니다.
				if(max<arr[i]) max = arr[i]; 
				
				//중력이 작용하면 빈 공간은 상쇄되므로, 최대 낙차 이후의 낙차값들은 별 의미가 없습니다.
				//따라서 배열의 뒤에 빈 공간이 아닌 값이 있다면 박스가 있다는 것이니, 최대 낙차에서 1씩 뺍니다.
				if(arr[i]<max && arr[i] != 0) max = max - 1;

			}
			if (max > answer) answer = max; //다음 루프에서 지금 값보다 더 큰 값이 나오면 대체합니다.
			max = 0; //루프를 돌기 전에 max를 초기화합니다.
		}
		System.out.println(answer);
	}
}
