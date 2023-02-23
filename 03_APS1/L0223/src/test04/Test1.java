package test04;


import java.util.Comparator;
import java.util.PriorityQueue;

public class Test1 {
  public static void main(String[] args) {
//    PriorityQueue<Person> ppq = new PriorityQueue<>(new NameComparator());
//    PriorityQueue<Person> ppq = new PriorityQueue<>(new AgeComparator());

//    PriorityQueue<Person> ppq = new PriorityQueue<>(new Comparator<Person>() {
//      @Override
//      public int compare(Person o1, Person o2) {
//        return o1.age - o2.age;
//      }
//    });
    //무명 클래스 사용: Comparator를 implement하는 클래스다.
    //객체를 단 한 번만 생성하고 재활용하지 않음.


    //람다 표현식: 함수를 간결하게 표현한 것
    //메서드의 길이가 짧은 경우 사용함
    //자바랑 어울리진 않는데, 자바는 객체지향이 엄격하게 적용되는 언어라서
    //함수가 객체를 벗어나 독립적으로 존재하는게 아주 띠꺼운 상황인것
    //함수형 프로그래밍에서는 독자적으로 독립 가능(예. js)
    //람다식은 함수형 프로그래밍을 자바에 도입한 것이라 할 수 있음
    //매개변수로 람다함수를 전달할 수 있음
    // (param) -> { body }, 파라미터가 단일 매개변수일 때 괄호 생략 가능
    //body가 단일 문장일 때 중괄호 생략 가능

    PriorityQueue<Person> ppq = new PriorityQueue<>((o1, o2) -> {
      if(o1.name.equals(o2.name)) return o1.age - o2.age; //이름이 같으면 나이순
      return o2.age - o1.age; //나이 역순
    });
    //comparator 자리인데 어떻게 함수가 들어가지?
    //자바가 좀 똑똑해서 그걸 알아서 처리해주는것. comparator을 구현할 때
    //오버라이드해야되는 메서드가 되도록 처리해줌..


    ppq.offer(new Person("김민식", 22));
    ppq.offer(new Person("유태영", 55));
    ppq.offer(new Person("차지은", 17));
    ppq.offer(new Person("신산하", 23));
    ppq.offer(new Person("김두현", 7));

    System.out.println(ppq.poll());
    System.out.println(ppq.poll());
    System.out.println(ppq.poll());
    System.out.println(ppq.poll());
    System.out.println(ppq.poll());
    //ClassCastException, test03.Person cannot be cast to java.lang.Comparable
    //age = 7부터 나옴
  }
}
