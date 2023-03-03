package s14510;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int tc = 1; tc <= T; tc++) {
      int N = sc.nextInt();

//      int sum = 0;
//      int max = 0;
//      for (int i = 1; i < N + 1; i++) {
//        int input = sc.nextInt();
//        sum += input;
//        max = max < input ? input : max;
//      }
//      sum = N*max - sum;
//      int alpha = sum%3;
//      int answer = (sum/3)*2 + alpha;
//      if(sum == 1) answer = 1;
//      if(sum == 2) answer = 2;
//      if(sum == 0) answer = 0;
      int[] arr = new int[N+1];
      int max = 0;
      for(int i=1; i<N+1; i++) {
        int input = sc.nextInt();
        arr[i] = input;
        max = max < input ? input : max;
      }
      int answer=0;

      for(int i=1; i<N+1; i++) {
        int temp = max-arr[i];
        arr[i] = temp%3;
        answer += (temp/3)*2;
      }

      L1:
      for(int i=1; i<N+1; i++ ){
        if(i%2 == 1) { //홀수 번째 날
          if(arr[i] == 1) { //1이 있으면
            arr[i]--; //1을 뺌
            answer++;
          } else if(arr[i] != 1) { //2나 0이면
            for(int j=1; j<N+1; j++) {
              if(j != i && arr[j] == 1) { //앞에서부터 1을 찾아서
                arr[j]--; //뺌
                answer++;
                continue L1;
              }
            }
            //만약 1을 못 찾았으면
            int twos = 0;
            for(int j=1; j<N+1; j++) {
              if(j != i && arr[j] == 2) { //앞에서부터 2가 있는지 확인
                twos++; //2를 찾았으면, twos ++
                if(twos > 1) { //2가 두개 이상
                  arr[j] --; // 마지막으로 찾은 2에서 하나 줄이기
                  answer++;
                  continue L1;
                }
              }
              //반복문 다 돌고 나왔는데
              if (twos == 1) { //2가 하나밖에 없으면
                answer++; //물 안줘야함
                continue L1;
              }
            }
          }
        }
        else if(i%2 == 0) {
          int zeros = 0;
          if (arr[i] == 2) { //2가 있으면
            arr[i] = arr[i] - 2; //걍 2를 뺌
            answer++;
          }else if(arr[i] != 2) { //2가 아니면
            for(int j=1; j<N+1; j++) {
              if(arr[j] == 0) zeros++;
              if(j != i && arr[j] == 2) { //2를 찾아서
                arr[j] = arr[j] - 2; //빼고
                answer++; //물 주기
                continue L1;
              }
            }
            if(zeros != N) answer++;
            // 다 0이면 고만해야함
          }
        }

      }
      System.out.println("#"+tc+" "+answer);
  }


      }

      }
