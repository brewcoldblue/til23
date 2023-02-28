package test03;

import java.util.PriorityQueue;

public class Test1 {
  public static void main(String[] args) {
    PriorityQueue<Person> ppq = new PriorityQueue<>();
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
