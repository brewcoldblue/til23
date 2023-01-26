package test07_equals;


public class Student extends Person{

	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public void study() {
		System.out.println("공부공부");
	}
	
	public void eat() {
		System.out.println("지식을 먹는다.");
		//필요하다면 자식 클래스에서 부모 클래스의 메서드를 재정의할 수 있다
	}
	
	//마우스 우클릭 - Source - override ...
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Student)obj).name);
	}
}
