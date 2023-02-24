package s6190;


import java.util.Scanner;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int tc=1; tc<=T; tc++) {
      int N = sc.nextInt();
      int[] arr = new int[N];

      int answer = -1;
      for(int i=0; i<N; i++) {
        arr[i] = sc.nextInt();
      }
      for(int i=0; i<N-1; i++) {
        L2:
        for(int j=i+1; j<N; j++) {
          int temp = arr[i]*arr[j];

          String str = Integer.toString(temp);
          int count = str.length()-1;

          for(int k=0; k<str.length()-1; k++) {
            if(str.charAt(k) <= str.charAt(k+1)) count--;
            else continue L2;
          }
          if(count == 0) answer = answer < temp ? temp : answer;
        }
        }
      System.out.println("#"+tc+" "+answer);
      }
    }
}
