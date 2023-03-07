package test02;

import java.util.Collections;
import java.util.PriorityQueue;

public class Test1 {
  public static void main(String[] args) {
    PriorityQueue<Integer> PQ = new PriorityQueue<>();
    PQ.offer(100);
    PQ.offer(2);
    PQ.offer(33);
    System.out.println(PQ.poll());
    System.out.println(PQ.poll());
    System.out.println(PQ.poll()); //기본값: 숫자가 작은 것이 우선 순위가 높다

    PQ = new PriorityQueue<>(Collections.reverseOrder()); //역방향으로 바꿔주는 comparator
    PQ.offer(100);
    PQ.offer(2);
    PQ.offer(33);
    System.out.println(PQ.poll()); //숫자가 높은 것이 우선 순위가 높아진다
    System.out.println(PQ.poll());
    System.out.println(PQ.poll());

    //PriorityQueue<Person> pq2 = new PriorityQueue<>();
    //object를 정렬하려면...
    //생성자에다가 comparator을 만들어 넣든지, person이 comparable의 구현체여야함
    //collections 복습하자...
  }
}
