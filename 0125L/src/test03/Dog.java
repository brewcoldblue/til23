package test03;

//일반 클래스인데, 추상 클래스를 상속받는다.
	public class Dog extends Animal { //모든 추상메서드 override 없으면 빨간줄
		@Override
		public void speak() {
			System.out.println("멍멍");
		}
		
		//자식 클래스에서 독단적으로 추상클래스에 없는 메서드를 정의한 경우
		public void eat() {
			System.out.println("뼈다귀 먹음");
		}
}
