package Test06;

public class Person {
	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public void eat() {
		System.out.println("식사를 합니다.");
		this.sleep(); // 이런 것도 가능함
	}
	
	public void sleep() {
		System.out.println("ZZZZZZZZ");
	}

}

