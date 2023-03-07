package Test03_default_2;
import Test03_default.Person; //다른 패키지이므로 일단 임포트 필요
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
//		System.out.println(p1.age); //default이므로, 다른 패키지에서는 접근이 불가능함
	}
}
