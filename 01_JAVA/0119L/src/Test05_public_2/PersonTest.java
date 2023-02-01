package Test05_public_2;
import Test05_public.Person;
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 13531;
		System.out.println(p1.age); //public일 때에는 어디서든 접근이 가능하다 (초록 원)
	}
}
