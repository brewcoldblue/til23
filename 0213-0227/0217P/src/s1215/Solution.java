package s1215;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = 10;
		for(int tc=1; tc<=TC; tc++) {
			int PL = sc.nextInt(); //찾아야 하는 회문의 길이

			char[][] letters = new char[8][8];
			char[][] lettersInv = new char[8][8];
			
			for(int r=0; r<8; r++) {
				//	자료를 받아와서 집어넣습니다
					char[]arr = sc.next().toCharArray();
					letters[r] = arr;
					for(int c=0; c<8; c++) {
						lettersInv[c][r] = arr[c];
					}
			}
			
			int answer = 0;
			for(int r=0; r<8; r++) {
				answer += isPalindrome(PL, letters[r]) + isPalindrome(PL, lettersInv[r]);
			}
			System.out.println("#"+tc+" "+answer);
		}
	}

	public static int isPalindrome(int range, char[] arr) {

		int answer = 0;

		for(int i=0; i<=arr.length-range; i++) {
			int flag = 0;
			int k=0;
			for(int j=i; j<i+range/2; j++) {
				if(arr[j] == arr[i+range-1-k]) {
					//뒤쪽 인덱스가 하나씩 줄어야 하는데
					//방법을 못 찾아서 변수 k를 추가로 만듦
					flag++;
					k++;
				}
				else break;
			}
			
			if(flag == range/2) {
				answer++;
			}
		}
		return answer;
	}
}

