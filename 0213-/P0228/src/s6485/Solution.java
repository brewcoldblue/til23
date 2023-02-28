package s6485;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스
    int T = sc.nextInt();

    //테스트 케이스만큼 반복
    for(int tc = 1; tc <= T; tc++) {

      int N = sc.nextInt();
      //입력 최댓값이 5000이라서...
      int[]arr = new int[5001];
      for(int n=0; n<N; n++) {
        //버스 노선 하나의 시작점과 끝점을 받아서
        int start = sc.nextInt();
        int end = sc.nextInt();
        //지나가는 정류장에 +1
       for(int j=start; j<=end; j++) {
         arr[j]++;
       }
      }
      //P개의 정류장
      int P = sc.nextInt();
      //정류장 C1, C2, ..., Cp까지 버스 노선이 몇 개 지나가는지 출력
      System.out.print("#"+tc+" ");
      for(int p=1; p<=P; p++) {
        System.out.print(arr[sc.nextInt()]+" ");
      }
      System.out.println();
    }
  }
}