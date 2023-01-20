package test08_hashcode;

public class Person extends Object {
	String name;
	int age;
	public void eat() {
		System.out.println("냠냠");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
