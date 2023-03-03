package S1873;

import java.util.Scanner;

public class Solution2 {
//  static char[][] map;
//  static int curH;
//  static int curW;
//  static char direction;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] map;
    int curH;
    int curW;
    char direction;
    int T = sc.nextInt();
    for(int tc = 1; tc <= T; tc++) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      map = new char[H][W];
      for(int h = 0; h<H; h++) {
        String str = sc.next();
        map[h] = str.toCharArray();
      }
      curH = -1;
      curW = -1;
      direction = ' ';

      L1:
      for(int h=0; h<H; h++) {
        for(int c=0; c<W; c++) {
          if(map[h][c] == '^' || map[h][c] == 'v' || map[h][c] == '<' || map[h][c] == '>') {
            curH = h;
            curW = c;
            break L1;
          }
        }
      }

      //명령어의 개수
      int N = sc.nextInt();
      //명령어
      String str = sc.next();
      for(int i=0; i<str.length(); i++) {
        switch(str.charAt(i)) {
          case 'U':
            direction = '^'; //방향을 전환합니다
            if (curH - 1 >= 0 && map[curH - 1][curW] == '.') { //평지일 경우
              map[curH][curW] = '.'; //전차가 이동한 자리는 평지
              map[curH - 1][curW] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
              curH--; //현재 위치 조정
            } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
            break;

          case 'D':
            direction = 'v'; //방향을 전환합니다
            if (curH + 1 < map.length && map[curH + 1][curW] == '.') { //평지일 경우
              map[curH][curW] = '.'; //전차가 이동한 자리는 평지
              map[curH + 1][curW] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
              curH++; //현재 위치 조정
            } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
            break;

          case 'L':
            direction = '<'; //방향을 전환합니다
            if (curW - 1 >= 0 && map[curH][curW - 1] == '.') { //평지일 경우
              map[curH][curW] = '.'; //전차가 이동한 자리는 평지
              map[curH][curW - 1] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
              curW--; //현재 위치 조정
            } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
            break;

          case 'R':
            direction = '>'; //방향을 전환합니다
            if (curW + 1 < map[curH].length && map[curH][curW + 1] == '.') { //평지일 경우
              map[curH][curW] = '.'; //전차가 이동한 자리는 평지
              map[curH][curW + 1] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
              curW++; //현재 위치 조정
            } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
            break;

          case 'S':
            int temp;
            switch (direction) {
              case '^':
                //위쪽 방향으로 포를 쏘았을 때
                temp = curH - 1;
                //벽이 나올때까지 포탄이 날아감
                while (!(map[temp][curW] == '*' || map[temp][curW] == '#')) {
                  //배열 범위까지 갔는데 벽이 안 나오면 탈출
                  if (temp == 0) break;
                  //벽이 안 나오면 위로 한 칸 더 탐색
                  else temp--;
                }
                //근데 만약 벽이 부술 수 있는 벽이면 평지로 만듦
                if (map[temp][curW] == '*') map[temp][curW] = '.';
                break;

              case 'v':
                temp = curH + 1;
                while (!(map[temp][curW] == '*' || map[temp][curW] == '#')) {
                  if (temp >= map.length) break;
                  else temp++;
                }
                if (map[temp][curW] == '*') map[temp][curW] = '.';
                break;

              case '<':
                temp = curW - 1;
                while (!(map[curH][temp] == '*' || map[curH][temp] == '#')) {
                  if (temp == 0) break;
                  else temp--;
                }
                if (map[curH][temp] == '*') map[curH][temp] = '.';
                break;

              case '>':
                temp = curW + 1;
                while (!(map[curH][temp] == '*' || map[curH][temp] == '#')) {
                  if (temp >= map[curH].length) break;
                  else temp++;
                }
                if (map[curH][temp] == '*') map[curH][temp] = '.';
                break;

            }
        }
      }
      System.out.print("#"+tc+" ");
      for(int h=0; h<H; h++) {
        for (int c = 0; c < W; c++) {
          System.out.print(map[h][c]);
        }
        System.out.println();
      }
    }
  }
}
