package test02;

public class Test {
	public static void main(String[] args) {
		//출력장치
		//인터페이스는 객체를 생성할 수는 없지만, 해당 인터페이스를 구현한 클래스로 객체 생성 가능
		HdmiOutput monitor = new Monitor(); //polymorphism; 인터페이스 타입으로 특정 객체 참조
		HdmiInput computer = new Computer();
		HdmiOutput tv = new TV();
		
		computer.setOutput(monitor);
		computer.show();
		
		computer.setOutput(tv);
		computer.show();
		
		HdmiInput SC = new SuperComputer();
		SC.setOutput(monitor);
		SC.show();
		
		//왜 인터페이스를 사용해야 하는가?
		//모듈화를 쉽게 하기 위해서. 설계도면 안 고치고 구현할 때만 새로 만들면 되기 때문에
		
	}
}
