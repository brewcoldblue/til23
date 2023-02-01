package Test04_protected_2;
import Test04_protected.Person;
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
//		System.out.println(p1.age); //protected이므로, 다른 패키지이므로 접근 불가능함
	}
}
