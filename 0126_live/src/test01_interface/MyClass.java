package test01_interface;

// 클래스는 인터페이스를 구현한다
// 인터페이스는 클래스에 의해 구현된다
public class MyClass implements MyInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}

	//클래스는  구현하는 인터페이스의 모든 추상메서드를 오버라이드해야 한다.



}
