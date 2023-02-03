package test01;

import java.util.Arrays;

public class Person {
	String name;
	int age;
	boolean hungry;
	String mbti;
	String []hobbies;
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", hungry=" + hungry + ", mbti=" + mbti + ", hobbies="
				+ Arrays.toString(hobbies) + "]";
	}
	public Person(String name, int age, boolean hungry, String mbti, String[] hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hungry = hungry;
		this.mbti = mbti;
		this.hobbies = hobbies;
	}
	
	
}
