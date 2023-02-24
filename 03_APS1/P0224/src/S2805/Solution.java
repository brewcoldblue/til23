package S2805;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int tc=1; tc<=T; tc++) {
      int N = sc.nextInt();
      int[][] arr = new int[N][N];

      for(int i=0; i<N; i++) {
        String str = sc.next();
        for(int j=0; j<N; j++) {
          arr[i][j] = str.charAt(j) - '0';
        }
      } //2차원 배열을 만들어서 받아온 숫자를 넣습니다.


        int answer = 0;
          //y좌표가 중심이면, 그 x좌표를 중심으로 x-C ~ x+C
          //y좌표가 중심에서 1 차이나면, 그 x좌표를 중심으로 x-(c-1) ~ x+(c-1)
          //y좌표가 중심에서 2 차이나면, 그 x좌표를 중심으로 x-(c-2) ~ x+(c-2)
          //y좌표가 중심에서 p 차이나면(p<=N/2) 그 x좌표를 중심으로 x-(N/2 -p) ~ x+(N/2 -p)
          //y좌표가 중심에서 N/2 차이나면 그 x좌표를 중심으로 x-0 ~ x+0이어야 함
        for(int p=0; p<=N/2; p++) { //중심좌표로부터 p는 상하 N/2까지 움직일 수 있음
          for(int t=-(N/2)+p; t<=N/2-p; t++) { //중심좌표부터 t는 좌우로 하나씩 좁아짐
            if(p==0) answer += arr[(N/2) - p][(N/2) + t];
            else {
              answer += arr[(N/2) - p][(N/2) + t]; //위쪽 방향 더하기
              answer += arr[(N/2) + p][(N/2) + t]; //아래쪽 방향 더하기
            }
          }
        }
      System.out.println("#"+tc+" "+answer);
      }
    }
}
