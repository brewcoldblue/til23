import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class s1225 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //테스트 케이스 받음
    int TC = 10;
    for(int tc=1; tc<=TC; tc++) {
      int N = sc.nextInt();
      Queue<Integer> q = new LinkedList<>();
      for(int i=0; i<8; i++) {
        q.offer(sc.nextInt());
      }

      int a = 1; //늘려가면서 뺄 변수 선언

      while(true) {

       int polled = q.poll();

       if(polled - a <= 0) { //0미만으로 내려가면
         q.offer(0); //0 집어넣고
         break; //끝
       } else {
         q.offer(polled - a); //빼서 a 빼고 도로 집어넣음
       }
       if(a == 5) a = 1; //a가 5면 사이클이 돌았으니까 1로 초기화
       else a++; //그게 아니면 a + 1

      }
      System.out.print("#"+tc+" ");
      while(!q.isEmpty()){
        System.out.print(q.poll()+" ");
      }
      System.out.println();
    }
  }
}
