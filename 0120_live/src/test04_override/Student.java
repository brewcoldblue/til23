package test04_override;


public class Student extends Person{

	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public void study() {
		System.out.println("공부공부");
	}
	
	@Override
	//어노테이션 권장, 붙이지 않아도 오버라이드는 되지만
	public void eat() {
		System.out.println("지식을 먹는다.");
		//필요하다면 자식 클래스에서 부모 클래스의 메서드를 재정의할 수 있다
	}
}
