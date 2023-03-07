package pkg1;
import pkg1.pkg2.Person;
//import pkg1.pkg2.pkg3.Person;
public class PackageTest {
	public static void main(String[] args) {
		
		pkg1.Person p1 = new pkg1.Person(); 
		//pkg1.person //단, 2번째줄의 임포트가 있으면 pkg1.pkg2.person
		//서로 다른 패키지에 있는데 이름이 같은 2개 이상의 클래스를 동시에 쓰고 싶으면
		//패키지를 생략할 수 없고,
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
//		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		//이렇게 겹치는 패키지에 풀네임을 써야함
		Person p4 = new Person(); // 얘는 위에서 임포트했으니까 pkg1.pkg2.person이 됨
		
		System.out.println(p1.pkg);
		System.out.println(p2.pkg);
//		System.out.println(p3.pkg);
		System.out.println(p4.pkg);
		
	}
}
