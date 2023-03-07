package Test04_protected_2;

import Test04_protected.Person;

public class Student extends Person { //상속
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 13; //protected일 때 다른 패키지에 있더라도 상속받으면 접근이 가능하다 (노란색 다이아)
	}
}
