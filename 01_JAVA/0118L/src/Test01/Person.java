package Test01;
// 모든 클래스는 특정 패키지에 속해 있다.
// 패키지는 클래스가 모여있는 폴더다.

public class Person {
	//필드(속성, 데이터, 변수)
	String name;
	int age;
	
	public void eat() {//반환형이 없다
		System.out.println(name+"이 식사를 합니다.");
	}
	//생성자
	//클래스명과 같음
	public Person() {
		//반환형을 지정하지 않음 (!= 메서드)
	}
}
