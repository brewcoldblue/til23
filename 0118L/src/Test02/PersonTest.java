package Test02;

public class PersonTest {
public static void main(String[] args) {
	Person p1 = new Person(); //생성자 없는데 이왜됨?
	//만약 설계도에 생성자가 하나도 없다면, JVM이 기본 생성자를 추가한다.
	//Person() {};을 기본으로 만들어주기 때문에...
	Person p2 = new Person();
	Person p3 = new Person();
	
	System.out.println(p1.species);
	System.out.println(p2.species);
	System.out.println(p3.species); //클래스 변수
	System.out.println(Person.species); //클래스 변수는 이런 접근도 가능함
	
}
	
}
