package test01;

//일반 클래스인데, 추상 클래스를 상속받는다.
	public class Person extends Animal { //모든 추상메서드 override 없으면 빨간줄
		@Override
		public void speak() {
			System.out.println("새해 복 많이 받으세요!");
		}
}
