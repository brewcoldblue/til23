package test09_polymorphism;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Person[] people = new Person[3];
		people[0] = new Person("유", 27);
		people[1] = new Student("김", 30); //다형성 1. 자식 클래스 타입 < 부모 클래스 타입
		people[2] = new Person("오", 30);
		
		for (Person p : people) {
			System.out.println(p.toString());
		}
		
		Person st = new Student("이승재", 25);
		
//		st.
		//이 경우 부모 클래스의 관점에서 보기 때문에, Student에서 오버라이딩한 메소드는 쓸 수 없게 된다.
		//이걸 형 변환이라고 함
		
}
}