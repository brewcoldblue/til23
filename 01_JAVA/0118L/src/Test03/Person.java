package Test03;

public class Person {
	static String species = "호모 사피엔스 사피엔스"; //클래스 변수
	
	String name; //인스턴스 변수, 인스턴스마다 달라질 수 있다
	int age;
	
	//생성자를 만들지 않고
	public int add(int a, int b) {
		return a + b;
	}
	public void eat() {
		String dish = "짜장면"; //지역변수
	}
	public void study(String subject) {
		
		double probability = Math.random();
		System.out.println(subject+"를 공부합니다.");
		System.out.println("알고리즘 문제를 풉니다.");
		
		if(probability < 0.9999) return ;
		
		System.out.println("게임을 합니다.");
		System.out.println("롤 영상을 시청합니다.");
	}
}

