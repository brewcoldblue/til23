package s4613;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스의 수
    int T = sc.nextInt();

    //tc번 테스트 케이스
    for(int tc=1; tc<=T; tc++) {
      //length
      int N = sc.nextInt();
      int M = sc.nextInt();
      String[][] arr = new String[N][M];
      for (int i = 0; i < N; i++) {
        String s = sc.next();
        arr[i] = s.split("");
      }

      int[][] cnt = new int[N][3];

      for (int r = 0; r < N; r++) {
        cnt[r][0] = M;
        cnt[r][1] = M;
        cnt[r][2] = M;
        for (int c = 0; c < M; c++) {
          //그 줄을 모두 W, B, B로 만들기 위해 필요한 연산 횟수
            if(arr[r][c].equals("W")) cnt[r][0]--;
            if(arr[r][c].equals("B")) cnt[r][1]--;
            if(arr[r][c].equals("R")) cnt[r][2]--;
        }
      }
      int answer = N*M;
        for (int w = 0; w < N - 2; w++) { //white\
          int minW = 0;
          int minB = 0;
          int minR = 0;

          for (int b = w + 1; b < N - 1; b++) { //blue
            for(int w2=0; w2<=w; w2++) {
              minW+=cnt[w2][0];
            }
            for(int b2 = w+1; b2 <= b; b2++) {
              minB+=cnt[b2][1];
            }
            for (int r = b + 1; r < N; r++) { //red
                minR+=cnt[r][2];
            }
            System.out.println(w+" : "+minW+" "+b+" : "+minB+" "+" : "+minR);
            answer = (answer > minW + minB + minR) ? minW + minB + minR : answer;
          }
        }
      System.out.println("#"+tc+" "+answer);
    }
  }
}

