package etc.b1244;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //스위치의 갯수
    int N = sc.nextInt();
    int[] arr = new int[N + 1];
    //스위치 값 받아서 배열에 넣기
    for (int i = 1; i <= N; i++) {
      arr[i] = sc.nextInt();
    }
    //스위치를 바꾸는 학생 수
    int S = sc.nextInt();
    //학생 수만큼 반복
    for (int i = 0; i < S; i++) {
      //학생의 성별
      int G = sc.nextInt();
      //스위치 넘버
      int sNum = sc.nextInt();

      //남학생은
      //스위치 번호를 받아서 그 번호의 배수에 해당하는 스위치를 바꿉니다
      if (G == 1) {
        for (int j = 1; j * sNum <= N; j++) {
          if (arr[j * sNum] == 0) arr[j * sNum] = 1;
          else arr[j * sNum] = 0;
        }
      }

      //여학생은
      //스위치 번호를 받아서 좌우로 대칭인지 확인한 후, 대칭이면 그 범위까지 함께 바꿉니다.
      //기본적으로 대칭이 아니어도 스위치 번호에 해당하는 스위치는 바꿉니다.
      if (G == 2) {
        //스위치 번호에 해당하는 스위치 바꾸기
        if (arr[sNum] == 0) arr[sNum] = 1;
        else arr[sNum] = 0;
        //스위치 번호로 +- j만큼 대칭인지 확인,
        for (int j = 1; j < arr.length; j++) {
          //인덱스 넘어가면 break
          if (j + sNum == arr.length || sNum - j == 0) break;
          //대칭으로 같으면 바꿉니다
          if (arr[j + sNum] == arr[sNum - j]) {
            if (arr[j + sNum] == 0) {
              arr[j + sNum] = 1;
              arr[sNum - j] = 1;
            } else {
              arr[j + sNum] = 0;
              arr[sNum - j] = 0;
            }
            //그 다음 쌍이 다르면 바로 반복문 탈출
          } else break;
        }
      }
    }
      //출력합니다. 출력 조건은 한 줄에 20개이므로, 20번째마다 빈 줄을 하나 넣습니다
      for (int j = 1; j < arr.length; j++) {
        System.out.print(arr[j] + " ");
        if(j%20 == 0) System.out.println();
      }
  }
}

