package test03;

public class Test {
	public static void main(String[] args) {
		
		Animal a1 = new Cat(); //이건 가능: 다형성을 이용함
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
//		a1.eat(); //쓸 수 없다..
		//다형성을 이용해서는 (Animal에 정의되지 않은) eat() 메서드를 사용할 수 없는 것
		
		Cat c1 = new Cat();
		c1.eat(); //방법 1. 처음부터 이렇게 만들어버리면 쓸 수 있다
		
		
		//방법2. instanceof 연산자
		//객체가 해당 클래스로 만든 객체이거나
		//해당 클래스의 조상 클래스로 만든 객체일 때 true
		//자식 클래스로 만들거나, 전혀 상관없는 클래스인 경우 false
		
		System.out.println(a1 instanceof Animal); //T
		System.out.println(a1 instanceof Cat); //T
		System.out.println(a1 instanceof Dog); //F
		
		if(a1 instanceof Cat) {
			Cat c = (Cat) a1;
			c.eat(); //형변환을 해서 사용할 수 있다
		}
		if(a1 instanceof Dog) {
			Dog d = (Dog) a2;
			d.eat(); //형변환을 해서 사용할 수 있다
		}
		if(a1 instanceof Cat) {
			Person p = (Person) a3;
			p.eat(); //형변환을 해서 사용할 수 있다
		}
	}
}
