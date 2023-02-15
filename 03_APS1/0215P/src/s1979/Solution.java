package s1979;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=1; i<=T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			int[][] invarr = new int [N][N];

			for(int c=0; c<N; c++) {
				for(int r=0; r<N; r++) {
					//숫자 받아온 배열과 뒤집힌 배열 생성
					arr[c][r] = sc.nextInt();
					invarr[r][c] = arr[c][r];
				}
			}
			
			int answer = 0;
			int count = 1;
			int invcount = 1;
			for(int c=0; c<N; c++) {
				for(int r=0; r<N-1; r++) {
					
					
						//카운트 중지, 카운트==K이면 결과 개수 1 추가

						//그 칸 1이고 그 다음칸도 1이면 카운트 증가
					if(arr[c][r] == 1 && arr[c][r+1] == 1) {
						count++;
						//카운트 증가시킨 시점이 마지막 칸이면
						if(r==N-2) {
							//카운트랑 K를 비교해서 결과 추가
							if(count == K) answer ++;
							count = 1;
						}
						//그 칸 1인데 그 다음칸이 0이면 카운트 중단
					} else if((arr[c][r] == 1 && arr[c][r+1] == 0)) {
							//카운트랑 K를 비교해서 결과 추가
						if(count == K) answer ++;
						count = 1;
					}
						//나머지는 결과에 상관없이 카운트 초기화
				    else count = 1;

					//가로, 세로가 뒤집힌 배열로 같은 로직을 한 번 더 실행
					if(invarr[c][r] == 1 && invarr[c][r+1] == 1) {
						invcount++;
						if(r==N-2) {
							if(invcount == K) answer ++;
							invcount = 1;
						}
					} else if((invarr[c][r] == 1 && invarr[c][r+1] == 0)) {
						if(invcount == K) answer ++;
						invcount = 1;
					}
				    else invcount = 1;
				}
			}
			System.out.println("#"+i+" "+answer);

			}
	}
}