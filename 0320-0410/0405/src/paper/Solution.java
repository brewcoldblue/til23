package paper;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int[][] arr;
    static boolean[][] visited;
    static boolean[][] visitedCopy;
    static int answer;
    static int maxR;
    static int maxC;
    static int startR;
    static int startC;
    static int count;
    static int papers;
    static void DFS(int r, int c) {
        if(visited[r][c]) return;
        visited[r][c] = true;


        //DFS를 우, 하, 좌, 상 순으로 실시합니다.
        int[]nr = {0, r+1, 0, r-1};
        int[]nc = {c+1, 0, c-1, 0};


        for(int i=0; i<4; i++) if(r-1 >= 0 && c-1 >= 0 && r+1 < 10 && c+1 < 10) {
            int next = arr[nr[i]][nc[i]];
            boolean nextVisited = visited[nr[i]][nc[i]];
            count++;
            if(!nextVisited && next == 1)  {
                if(i==1) maxR = maxR < nr[i] ? nr[i] : maxR;
                if(i==2) maxC = maxC < nc[i] ? nc[i] : maxC;
                DFS(nr[i], nc[i]);
            }
//            papers[i]--;
        }
        visited[r][c] = false;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++) {
            answer = 0;
            maxR = 0;
            maxC = 0;
            count = 0;
            papers = 0;
            arr = new int[10][10];
            visited = new boolean[10][10];
            for(int r=0; r<10; r++) {
                for(int c=0; c<10; c++) {
                    int input =sc.nextInt();
                    arr[r][c] = input;
                    if(input == 1) papers++;
                }
            }
            //visitedcopy..를 써야할것 같은데...
            //
            for(int r=0; r<10; r++) {
                for(int c=0; c<10; c++) {
                    DFS(r, c);
                    //가로와 세로 길이가 같으면,,,
                    if(maxR - r == maxC - c && count == Math.pow(maxR-r, 2)) {
                        answer++;
                    }
                    papers = papers - count;

                }
            }

            System.out.println("#"+tc+" "+papers);
        }
    }
}
