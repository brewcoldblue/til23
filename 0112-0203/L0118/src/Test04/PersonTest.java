package Test04;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		int sum = p1.add(6, 22);
		System.out.println(sum);
		
		double sum2 = p1.add(34.2, 101.1034);
		System.out.println(sum2);
		
		p1.eat();
		p1.eat("햄버거");
		p1.eat("햄버거", 3);
		p1.eat(4, "피자");
	}
}
