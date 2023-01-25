package test01;

public class Test {
	public static void main(String[] args) {
//		Animal a = new Animal(); //Cannot instantiate the type Animal
		// 추상클래스로 객체를 만들 수 없다
		Animal a1 = new Cat(); //이건 가능: 다형성을 이용함
		Animal a2 = new Dog();
		Animal a3 = new Person();
		
		a1.speak();
		a2.speak();
		a3.speak();
		//실제 생성된 객체가 가지고 있는 메서드가 실행된다
		
		//객체가 생성되지 못하도록 막을 때(가 합리적인 상황일 때)
		//자식 클래스에서 메서드의 재정의를 강제하고 싶을 때
		
	}
}
