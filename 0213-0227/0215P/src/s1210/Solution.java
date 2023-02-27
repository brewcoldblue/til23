package s1210;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = 10;

		for(int i=1; i<=TC; i++) {
			int T = sc.nextInt();
			int[][] arr = new int[100][100];
			for(int c=0; c<100; c++) {
				for(int r=0; r<100; r++) {
					arr[c][r] = sc.nextInt();
				}
			}
			
			//주어진 배열에서 도착점 target을 찾습니다
			int target = -1;
			for(int r=0; r<100; r++) {
				if(arr[99][r] == 2) {
					target = r;
					break;
				}
			}

			//move 메서드에 아규먼트로 도착점과 배열을 전달합니다.
			int x = target;
			int y = 99;
			int answer = -1;
			
			while (y>0) {
				if(x!=0 && arr[y][x-1] == 1) { //좌측에 통로가 있으면 거기로 이동
					while(x!=0 && arr[y][x-1] == 1) {
					x--;
					}
					y--;//통로 끝에서는 무조건 위로 한 칸 이동
				} else if (x!=99 && arr[y][x+1] == 1) { //우측에 통로가 있으면 거기로 이동
					while(x!=99 && arr[y][x+1] == 1) {
					x++;
					}
					y--;//통로 끝에서는 무조건 위로 한 칸 이동
				} else if (arr[y-1][x] == 1) { //좌우에 통로가 없으면 위로 이동
					y--;
				} 
			}
		
			answer = x;
			System.out.println("#"+i+" "+answer);

		}
	}

}