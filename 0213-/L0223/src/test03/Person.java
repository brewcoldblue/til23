package test03;

public class Person implements Comparable<Person>{
  public String name;
  public int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  @Override
  public int compareTo(Person o) {
//    return this.age - o.age; //내 나이 - 남의 나이, 오름차순
    return this.name.compareTo(o.name); //문자열 비교, 오름차순
  }
}
