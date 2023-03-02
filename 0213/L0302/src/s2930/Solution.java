package s2930;

import java.util.Scanner;

public class Solution {
  //배열의 교환 연산은 swap이라는 메서드를 만들어서...
  //main method가 static이기 때문에, 사용할 배열과 메서드를 static으로 선언하는 것이 어떠한가...
  static int[] arr; //완전 이진 트리(힙)을 나타낼 배열
  static int lastIdx; //힙의 마지막 인덱스(빈 공간이 나오기 직전 인덱스);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt(); //TC 수
    for(int tc=1; tc<=T; tc++) {
      //각 테스트 케이스에서 연산의 갯수 N이 먼저 주어짐

      System.out.print("#"+tc+" ");

      int N= sc.nextInt();
      arr = new int[N+1]; //최대 N번 삽입될 수 있으므로 N까지의 인덱스가 필요함
      lastIdx = 0; //초기화

      //명령어의 개수 N만큼 반복
      for(int i=0; i<N; i++) {
        //명령어 숫자부터 입력 받기
        int c = sc.nextInt();
        if(c == 1) { //삽입 명령 => 힙에 추가
          //배열의 가장 마지막 인덱스에 추가해서 루트로 올라감
          int num = sc.nextInt(); //삽입할 수
          arr[++lastIdx] = num; //일단 가장 마지막 인덱스에 새로운 수 추가
          int cur = lastIdx; //현재 노드를, 마지막 노드에서 출발하여 부모와 비교해서 거슬러 올라가야 함
          while(cur > 1 && arr[cur/2] < arr[cur]) {
            swap(cur/2, cur); //부모가 자식보다 작으면 바꾼다
            cur = cur / 2; //위치를 갱신한다
          }
        } else if(c == 2) { //삭제 명령 => 루트 노드 출력하고 힙에서 삭제
            if(arr[1] == 0) System.out.print(-1 + " "); //arr[1]에 값이 없으면 아무것도 안 함
            else {
              System.out.print(arr[1] + " "); //일단 삭제할 값 출력
              //배열의 루트를 삭제하고 가장 마지막 인덱스를 루트로 옮기고 루트에서 리프로 내려감
              arr[1] = arr[lastIdx]; //덮어써서 삭제
              arr[lastIdx--] = 0; //마지막 인덱스 값 없애고 줄이기
  //          lastIdx--; //이것도 가능
              int cur = 1; //부모의 입장, 루트에서 시작
              while (true) {//cur >= 자식일 때 종료
                int child = cur * 2; //왼쪽 자식이라고 가정
                //오른쪽 자식이 있고, 오른쪽 자식이 더 크다면 오른쪽 자식을 선택함
                if (child + 1 <= lastIdx && arr[child] < arr[child+1]) child++;
                //부모가 만약 자식보다 더 크면 그대로 종료, 작으면 자리를 바꾸고 현재 위치를 child로 바꿈
                if (child > lastIdx || arr[cur] > arr[child]) break;
                else {
                  swap(cur, child);
                  cur = child;
                }
              }
            }
        }
      }
      System.out.println();
    }
  }

  public static void swap(int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }
}
