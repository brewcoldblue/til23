package s3499;

import java.util.LinkedList;
import java.util.Queue;
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

      String[] arr = new String[N];

      //arr에 원소를 하나씩 집어넣습니다
      for(int i=0; i<N; i++) {
        arr[i] = sc.next();
      }

      //큐를 하나 선언합니다
      Queue<String> Q = new LinkedList<>();

      //N-1이 인덱스 최댓값이어서 그것의 반만큼만 순회하는데, length가 홀수면
      //인덱스 값의 절반 + 0.5까지를 카드 뭉치 1로 보고 셔플합니다
      for(int i=0; i<=(N-1)/2; i++) {
        //큐에 카드 뭉치 1과
        Q.add(arr[i]);
        //카드 뭉치 2를 차례로 넣습니다
        if(i+1+(N-1)/2<N) Q.add(arr[i+1+(N-1)/2]);
      }
      //아주 난잡한..출력...
      System.out.print("#"+tc+" ");
      for(String s : Q) {
        System.out.print(s.toString()+" ");
      }
      System.out.println();

    }
  }
}
