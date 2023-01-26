package Test07_singleton;

public class Person {
	private String name;
	private int age;
	private boolean hungry;
	
	
	private static Person instance = new Person(); //자기 자신 생성하기
	private Person() {
			this.name = "유일한 사람";
			this.age = 12313;
	}; //생성자 막기
	
	public static Person getInstance() {
		return instance;
	} //유일한 통로를 public으로 열어두기
	
	public String getName() { //접근자: get+멤버 변수 이름
		return name;
	}
	public void setName(String name) { //설정자: set+멤버 변수 이름
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("어떻게 나이가 마이너스냐");
			return;
		}
		if(age > 200) {
			System.out.println("그렇게 오래 살 수는 없어요");
			return;
		}
		this.age = age;
	}

}
