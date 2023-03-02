package S1873;

import java.util.Scanner;

public class Solution {
  static String[][] map;
  static int curH;
  static int curW;
  static String direction;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for(int tc = 1; tc <= T; tc++) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      map = new String[H][W];
      for(int h = 0; h<H; h++) {
        String str = sc.next();
        map[h] = str.split("");
      }
      curH = -1;
      curW = -1;
      direction = "";
      for(int h=0; h<H; h++) {
         for(int c=0; c<W; c++) {
           if(map[h][c].equals("^") ||
              map[h][c].equals("v") ||
              map[h][c].equals("<") ||
              map[h][c].equals(">")
           ) {
             curH = h;
             curW = c;
             break;
           }
         }
      }
      int N = sc.nextInt();
      String str = sc.next();
      String[] actions = str.split("");
      for(String a:actions) {
        if(a.equals("U")) {
          direction = "^"; //방향을 전환합니다
          if(curH-1 >= 0 && map[curH-1][curW].equals(".")) { //평지일 경우
            map[curH][curW] = "."; //전차가 이동한 자리는 평지
            map[curH-1][curW] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
            curH--; //현재 위치 조정
          } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
        }
        if(a.equals("D")) {
          direction = "v"; //방향을 전환합니다
          if(curH+1 < map.length && map[curH+1][curW].equals(".")) { //평지일 경우
            map[curH][curW] = "."; //전차가 이동한 자리는 평지
            map[curH+1][curW] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
            curH++; //현재 위치 조정
          } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
        }
        if(a.equals("L")) {
          direction = "<"; //방향을 전환합니다
          if(curW-1 >= 0 && map[curH][curW-1].equals(".")) { //평지일 경우
            map[curH][curW] = "."; //전차가 이동한 자리는 평지
            map[curH][curW-1] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
            curW--; //현재 위치 조정
          } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
        }
        if(a.equals("R")) {
          direction = ">"; //방향을 전환합니다
          if(curW+1 < map[curH].length && map[curH][curW+1].equals(".")) { //평지일 경우
            map[curH][curW] = "."; //전차가 이동한 자리는 평지
            map[curH][curW+1] = direction; //전차가 이동할 자리는 방향을 바꾼 전차
            curW++; //현재 위치 조정
          } else map[curH][curW] = direction; //이동 안 해도 방향은 바꿔줘야 함
        }
        if(a.equals("S")) {
          int temp;
          if(direction.equals("^")) {
            temp = curH - 1;
            while(!(map[temp][curW].equals("*") || map[temp][curW].equals("#"))) {
              if(temp == 0) break;
              else temp--;
            }
            if(map[temp][curW].equals("*")) map[temp][curW] = ".";
          } else if(direction.equals("v")) {
            temp = curH + 1;
            while(!(map[temp][curW].equals("*") || map[temp][curW].equals("#"))) {
              if(temp >= map.length) break;
              else temp++;
            }
            if(map[temp][curW].equals("*")) map[temp][curW] = ".";
          } else if(direction.equals("<")) {
            temp = curW - 1;
            while(!(map[curH][temp].equals("*") || map[curH][temp].equals("#"))) {
              if(temp == 0) break;
              else temp--;
            }
            if(map[curH][temp].equals("*")) map[curH][temp] = ".";
          } else if(direction.equals(">")) {
            temp = curW + 1;
            while(!(map[curH][temp].equals("*") || map[curH][temp].equals("#"))) {
              if(temp >= map[curH].length) break;
              else temp++;
            }
            if(map[curH][temp].equals("*")) map[curH][temp] = ".";
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
