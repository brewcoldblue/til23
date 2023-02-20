package s2007;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for(int tc=1; tc<=TC; tc++) {
			int N = 5;
			
			//문자열 길이는 30으로 주어져 있다

			String str = sc.next();

			String[] arr = str.split("");
			int[] idxArr = new int[arr.length];
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("(")) idxArr[i] = 1;
				if(arr[i].equals(")")) { //닫는 괄호가 나오면
					idxArr[i] = -1;
					}
				}
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals(")")) { //닫는 괄호가 나오면

					for(int j=i; j>=0; j--) { //역방향으로 탐색해 가장 먼저 나오는 괄호를 찾습니다
						if(arr[j].equals("(")) {
							arr[j] = " ";
							arr[i] = " ";
							idxArr[i] = i; //닫힌 괄호 쌍임을 표시합니다
							idxArr[j] = i;
							break; 
						}
					}
				}
			}
			for (int i=0; i<idxArr.length -1; i++) {
				if(idxArr[i] == idxArr[i+1]) {
					idxArr[i] = 0; //레이저
					idxArr[i+1] = 0; //레이저
				}
			}

			int answer = 0;
			
			for (int i=0; i<idxArr.length; i++) {
				//레이저 만나면 다시 돌기
				if(idxArr[i] == 0) continue;
				int count = 0;

				for (int j=1; j+i<idxArr.length; j++) {

					if(idxArr[i+j] == 0) count++; //레이저 만나면 카운트
					if(idxArr[i+j] == idxArr[i]) { //자기랑 같은 수 만나면
						count = (count/2) + 1;
						//마주치는 0의 개수를 2로 나누면 레이저의 개수가 되고
						//거기에 1을 더하면 잘린 철판의 갯수가 됨
						//answer에 값을 누적시키고 반복문을 빠져나옴
						answer = answer + count;
						break;
					}
				}

			}
			System.out.println(Arrays.toString(idxArr));
			System.out.println("#"+tc+" "+answer);	
		}
		
	}
}




