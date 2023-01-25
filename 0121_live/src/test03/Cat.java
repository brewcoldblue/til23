package test03;

	public class Cat extends Animal {
		@Override
		public void speak() {
			System.out.println("야옹");
		}
		
		//자식 클래스에서 독단적으로 추상클래스에 없는 메서드를 정의한 경우
		public void eat() {
			System.out.println("생선 먹음");
		}
}
