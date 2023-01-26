package Test04;

public class Person {
	static String species = "호모 사피엔스 사피엔스";
	
	String name;
	int age;
	
	//메서드 오버로딩
	//다양한 자료형에 대해 메서드를 만들 때 이름이 같으면 중복 코드로 관리할 수 있어 편함
	public int add(int a, int b) {
		return a + b;
	}
	public double add(double a, double b) {
		return a + b;
	}
//	public int add(float a, float b) {
//		return (int) a + b; 
//	} 이거 불가능함, 에러뜸
	

	
	public void eat() {
		System.out.println("식사를 합니다.");
	}
	public void eat(String dish) {
		System.out.println(dish+"를 먹습니다.");
	}
	public void eat(String dish, int times) {
		System.out.println(dish+"를 "+times+"회 먹습니다.");
	}

	public void eat(int times, String dish) {
		System.out.println(dish+"를 "+times+"회 먹습니다.");
	} //파라미터 순서만 바뀌어도 다른 파라미터로 인정되어서 생성 가능함
}

