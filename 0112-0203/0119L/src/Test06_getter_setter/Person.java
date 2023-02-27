package Test06_getter_setter;

public class Person {
	private String name;
	private int age;
	private boolean hungry;
	//멤버 변수를 직접 수정할 수 없는 private로 만듬
	
	//위 멤버 변수에 접근할 수 있는 통로를 public 메서드로 만든다
	//값 변경 -> 설정자setter
	//값 조회 -> 접근자getter
	
	//마우스 우클릭 -> source -> generate -> getters and setters
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
	public boolean isHungry() { //접근자: 형용사일 때 ㅋㅋ
		return hungry;
	}
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	

	
}
