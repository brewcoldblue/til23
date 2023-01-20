package test05_binding;

public class Person {
	String name;
	int age;
	public void eat() {
		System.out.println("냠냠");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
