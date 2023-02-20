package s1213;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = 10;
		for(int tc=1; tc<=TC; tc++) {
			int N = sc.nextInt();
			String P = sc.next();
			String T = sc.next();
			char[] Parr = P.toCharArray(); //입력받은 문자를 배열로 바꿈
			char[] Tarr = T.toCharArray();
			int PL = Parr.length;
			int TL = Tarr.length;
			
			int answer = 0;
			
			for(int i=0; i<TL-PL+1; i++) { //최대 반복 횟수
				int flag = 0;
				for(int j=0; j<PL; j++) { //패턴 문자열이랑 같은지 비교
					if(Parr[j] != Tarr[i+j]) break;//다르면 그냥 나오고
					else flag++; //같으면 플래그 +1
				}
				if(flag == PL) { //같은 글자수가 패턴 글자수랑 같으면
					answer++; //정답 인정
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
}

