package test09_polymorphism;


public class Student extends Person{

	String major;

	public Student(String name, int age) {
		super(name, age);
	}
	public void study() {
		System.out.println("공부공부");
	}
	
	public void eat() {
		System.out.println("지식을 먹는다.");
		//필요하다면 자식 클래스에서 부모 클래스의 메서드를 재정의할 수 있다
	}
}
