package etc.b1158;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //전체 테스트 케이스의 수를 입력받습니다
    int T = 1;

    //테스트 케이스만큼 반복합니다
    for (int tc = 1; tc <= 1; tc++) {
      //사람 수인 N을 입력받습니다
      int N = sc.nextInt();
      //큐를 하나 선언합니다
      Queue<Integer> Q = new LinkedList<>();

      //1, 2, 3, ..., N번 사람까지 큐에 들어갑니다.
      for(int i = 1; i <= N; i++ ) {
        Q.offer(i);
      }

      int K = sc.nextInt();
      System.out.print("<");
      for(int j = 1; j <= N*K; j++) {
        int exit = Q.poll(); //자기 차례가 오면
        if(j%K != 0) Q.offer(exit); //따를 외친 사람은 탈출하고, 쿵을 외친 사람은 맨 뒤로 다시 갑니다

        //K번째로 나간 사람을 출력 형식에 맞게 출력합니다.
        if(j%K == 0 && j!=N*K) System.out.print(exit+", ");
        if(j==N*K) System.out.print(exit);
      }
      System.out.print(">");
      System.out.println();
    }
  }
}
