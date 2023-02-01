package Test07_singleton;

public class PersonTest {
	public static void main(String[] args) {
//		Person p1 = new Person(); //싱글턴에서는 이런 식으로 객체를 추가로 생성할 수 없다. 생성자가 막혀 있기 때문
		Person p1 = Person.getInstance();
		Person p2 = Person.getInstance();
		System.out.println(p1.getName());
		System.out.println(p2.getAge());
// 
	}
}
