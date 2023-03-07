package test03;

import java.util.List;

public class Person {
	String name;
	int age;
	boolean hungry;
	String mbti;
	List<String> hobbies;
	List<Person> friends; //같은 패키지 안에 있는 자기 자신
	
	public Person(String name, int age, boolean hungry, String mbti, List<String> hobbies, List<Person> friends){
		super();
		this.name = name;
		this.age = age;
		this.hungry = hungry;
		this.mbti = mbti;
		this.hobbies = hobbies;
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hungry=" + hungry + ", mbti=" + mbti + ", hobbies="
				+ hobbies + ", friends=" + friends +"]";
	}

	
	
	
}
