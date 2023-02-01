package test01;

//추상클래스를 만들 것이므로 굳이 객체를 생성할 필요가 없음
//추상메서드를 갖는 클래스
abstract public class Animal {
	
	//추상메서드 예시
	//1. abstract 키워드
	//2. 블록 없이 세미콜론으로 끝남
	//3. 일반 클래스는 추상메서드를 가질 수 없기 때문에 추상메서드가 있다면 그 클래스는 추상클래스가 된다. 
	abstract public void speak(); 
	
	// 접근제한자와 그 외 제한자(지정예약어)인 static, final, abstract는 
	// 순서에 상관없이 사용해도 되지만 보통은 접근제한자를 뒤에 붙임
	public static int a = 10;
	static public int b = 20;
	
}
