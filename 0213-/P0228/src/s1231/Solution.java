package s1231;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스는 10으로 고정
    int T = 10;
    //테스트 케이스만큼 반복
    for(int tc = 1; tc <= T; tc++) {
      //노드의 갯수
      int N = sc.nextInt();
      //노드를 모두 받을 수 있도록 노드 수 + 1만큼 배열 생성
      //0번 인덱스 미사용
      String[]arr = new String[N+1];
      //입력값 처리
      for(int i=1; i<=N; i++) {
        //인덱스와 값을 배열에 넣고
        int idx = sc.nextInt();
        arr[idx] = sc.next();
        //left, right가 있을 때에만 그 값을 받아온다 (여기서 쓰지는 않는데 처리는 필요..)
        int left;
        int right;
        if(i*2<=N) left = sc.nextInt();
        if(i*2+1<=N) right = sc.nextInt();
      }
      //출력
      System.out.print("#"+tc+" ");
      inorder(arr, 1);
      System.out.println();
    }
  }
  //중위 순회 알고리즘
  public static void inorder(String[] tree, int i) {
    if(i < tree.length) {
      inorder(tree, i*2);
      System.out.print(tree[i]);
      inorder(tree, i*2+1);
    }
  }
}