package test10_polymorphism2;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("김", 25, "자바");
		
		Person p = st;
		Person p2 = new Person("이", 33);	
		
		Student st3 = (Student) p;
		st3.study(); 
		
//		Student st2 = (Student) p2;
//		st2.study(); //error, 강제 형 변환이기 때문에 메모리 상에는 메서드가 없음
		

}
}