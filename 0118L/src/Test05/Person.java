package Test05;

public class Person {
	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public void eat() {
		System.out.println("식사를 합니다.");
	}
	
	//파라미터가 있는 생성자
	public Person(String name, int age) {
		this.name = name; //this로 생성한 인스턴스 변수에 접근합니다
		this.age = age;
	}
	public Person() {
		this("정진성", 27); //파라미터에 맞는 "자기 자신"을 자동으로 호출합니다
	} //이렇게 기본 생성자와 같이 있을 수 있다
}

