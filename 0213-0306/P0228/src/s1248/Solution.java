package s1248;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스
    int T = sc.nextInt();

    //테스트 케이스만큼 반복
    for (int tc = 1; tc <= T; tc++) {
      int V = sc.nextInt();
      int E = sc.nextInt();
      int t1 = sc.nextInt();
      int t2 = sc.nextInt();
      int[] arr = new int[V + 1];
      int[][] reverse = new int[V + 1][V + 1];
      for (int i = 0; i < E; i++) {
        int from = sc.nextInt();
        int to = sc.nextInt();
        arr[to] = from;
      }
      int CPN = 0;
      boolean terminated = false;
      while (!terminated) {
        int p1 = arr[t1];
        int p2 = arr[t2];
        if (p1 == p2) {
          CPN = p1;
          break;
        }
        if (p1 < p2) t2 = p2;
        if (p1 > p2) t1 = p1;
      }
      System.out.println(Arrays.toString(arr));
      System.out.println(CPN);
//
//      for(int i=CPN; i<arr.length; i++) {
//        int[] answer = findNode(arr, CPN);
//      }
//      System.out.println("#" + tc + " " + CPN + " " + vertices);
    }
  }

}


