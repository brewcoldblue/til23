package test03;

//일반 클래스인데, 추상 클래스를 상속받는다.
	public class Person extends Animal { //모든 추상메서드 override 없으면 빨간줄
		@Override
		public void speak() {
			System.out.println("새해 복 많이 받으세요!");
		}
		
		//자식 클래스에서 독단적으로 추상클래스에 없는 메서드를 정의한 경우
		public void eat() {
			System.out.println("떡볶이를 먹음");
		}
}
