import java.util.Scanner;

public class s7102 {
  public static void main(String[] args) {
    //준홍이의 카드놀이
    Scanner sc = new Scanner(System.in);
    //테스트 케이스 받음
    int TC = sc.nextInt();
    for(int tc=1; tc<=TC; tc++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int min = Math.min(M,N);
      int max = Math.max(M,N);
      //min+1과 max+1 사이에 있는 모든 수는 나올 확률이 같으며, 가장 높다.
      //ex. n=6, 1 2 3 4 5 6
      //    m=8, 1 2 3 4 5 6 7 8 이면 7, 8, 9가 답이다.
      System.out.print("#"+tc+" ");
      for(int i=min+1; i<=max+1; i++) System.out.print((i)+" ");
      System.out.println();
    }

  }
}