package s4613;

import java.util.Scanner;

public class Solution_failed1 {
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
      int[][] cnt = new int[N][3];
      int answer = 0;
      for (int i = 0; i < N; i++) {
        String s = sc.next();
        arr[i] = s.split("");
      }
      for (int r = 0; r < N; r++) {
        int W=0;
        int B=0;
        int R=0;
        String flag = "W";
        for (int c = 0; c < M; c++) {
          //첫 줄은 무조건 white
          if(r==0 && !arr[0][c].equals("W")) answer++;
          //마지막 줄은 무조건 red
          if(r==N-1 && !arr[N-1][c].equals("R")) answer++;
          //그 사이에서 찾으면 카운팅 배열에 올림
          if((r>1 && r<N-1)) {
            if(arr[r][c].equals("W")) cnt[r][0]++;
            if(arr[r][c].equals("B")) cnt[r][1]++;
            if(arr[r][c].equals("R")) cnt[r][2]++;
          }
        }
      }
      //카운팅 배열에서 부분합 구하려고 하는데
      //어떻게 해야할지 모르겠음..
        int white = 0;
        int red = 0;
        int blue = 0;
        int max = 0;
        for(int c=0; c<3;) {
          int sum = 0;
          for(int r=0; r<N-1; r++) {
            sum += cnt[r][c];
          }
        }
          if(white+red+blue > max) max = white+red+blue;

      System.out.println(max);
    }
  }
}
