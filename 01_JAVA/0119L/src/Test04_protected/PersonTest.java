package Test04_protected;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.age); //protected이므로, 다른 클래스에 있지만 같은 패키지이므로 접근 가능함
	}
}
