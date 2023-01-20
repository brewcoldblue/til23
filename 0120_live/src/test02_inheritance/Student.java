package test02_inheritance;

//클래스의 상속은 extends를 사용함
//상위 클래스와 중복되는 부분은 삭제
public class Student extends Person{
//	String name;
//	int age;
	String major;
	
//	public void eat() {
//		System.out.println("냠냠");
//	}
	
	public void study() {
		System.out.println("공부공부");
	}
}
