package Test01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(); //객체의 생성: 클래스 이름이 자료형처럼 쓰인다
		p1.name="유승윤"; //public은 같은 프로젝트라면 다른 패키지여도 임포트가 필요없음
		p1.age=166005440;
		p1.eat();
		
		Person p2 = new Person();
		p2.name="정진성";
		p2.age=2078;
		p2.eat();
	}
}
