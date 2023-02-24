import java.util.LinkedList;

public class Test1_내장_linkedlist {
  public static void main(String[] args) {
    LinkedList<Integer> LL = new LinkedList<>();
    LL.add(1);
    LL.add(2); //기본적으로 가장 뒤에 추가
    LL.addLast(3); //가장 뒤에 추가
    LL.addFirst(4); //가장 앞에 추가
    LL.add(2,5); //2번 인덱스 뒤에 5 추가
//    LL.remove(); //가장 앞에 있던 4 삭제
//    LL.removeFirst();//가장 앞에 있는 것 제거
//    LL.removeLast(); //가장 뒤에 있는 것 제거
    LL.remove(2); //2번 인덱스에 있던 5를 제거하고 빈 공간을 당긴다
    //offer 등 큐에서 썼던 그거 다 됨
    //스택에서 썼던 push, pop 등도 다 됨
    System.out.println(LL);
  }
}