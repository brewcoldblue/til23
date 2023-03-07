package test03_super;


public class Student extends Person{

	String major;
	
	//파라미터가 있는 생성자를 만들어줘야 한다
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public void study() {
		System.out.println("공부공부");
	}
}
