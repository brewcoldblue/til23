package s1860;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int tc = 1; tc<= T; tc++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();

      int[]arrive = new int[11112];
      for(int i=0; i<N; i++) {
        int time = sc.nextInt();
        arrive[time] ++;
      }
      String answer = "Possible";
      int b = 0;
      for(int i=0; i<arrive.length; i++) {
        if(i!=0 && i%M == 0) b += K;
        b = b - arrive[i];
        if(b<0) {
          answer = "Impossible";
          break;
        }

      }

      System.out.println("#"+tc+" "+answer);
    }
  }
}
