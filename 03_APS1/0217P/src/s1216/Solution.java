package s1216;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = 10;
		for(int tc=1; tc<=TC; tc++) {
			int N = sc.nextInt(); //테스트 번호

			//100x100으로 배열의 사이즈가 고정되어 있습니다.
			//행 기준으로 판단하기 위해 두 개의 배열을 만들고,
			//행과 열을 반대로 해서 자료를 집어넣습니다.
			char[][] letters = new char[100][100];
			char[][] lettersInv = new char[100][100];
			
			for(int r=0; r<100; r++) {
				//자료를 받아와서 두 배열에 넣는 과정입니다.
					char[]arr = sc.next().toCharArray();
					letters[r] = arr;
					//뒤집힌 배열은 따로 넣어줍니다.
					for(int c=0; c<100; c++) {
						lettersInv[c][r] = arr[c];
					}
			}
			
			int answer = 0; //가장 큰 배열의 길이
			
			for(int r=0; r<100; r++) {
				for(int PL=2; PL<100; PL++) {
				//PL = palindrome length
				//2 <= 회문의 길이 <= 100 
				//isPalindrome은 회문의 길이와 배열을 받아
				//그 배열 안에 그 길이의 회문이 있으면 입력했던 회문의 길이를 다시 리턴합니다.
				int temp = isPalindrome(PL, letters[r]);
				int tempv = isPalindrome(PL, lettersInv[r]);
				//더 큰 값이 있으면 덮어씁니다.
				answer = temp > answer ? temp : answer; 
				answer = tempv > answer ? tempv : answer;
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}

	public static int isPalindrome(int range, char[] arr) {
		//range...라고 썼는데 회문의 길이입니다
		//이차원 배열의 한 row를 받아옵니다
		for(int i=0; i<=arr.length-range; i++) {
			int flag = 0; //비교 성공 횟수
			int k=0; 
			for(int j=i; j<i+range/2; j++) {
				if(arr[j] == arr[i+range-1-k]) { //인덱스를 줄이기 위해 k를 사용합니다.
					flag++;
					k++; //한 번 비교한 후 성공하면 k를 증가킵니다.
				}
				else break; //비교에 실패하면 빠져나옵니다
			}
			if(flag == range/2) { //비교해야 할 횟수만큼 성공하면
				return range; //그 길이를 리턴합니다
			}
		}
		return 0;
	}
}