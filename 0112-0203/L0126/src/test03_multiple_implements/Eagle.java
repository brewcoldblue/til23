package test03_multiple_implements;

//사냥도 하고 날기도 한다
public class Eagle implements AbleToFly, AbleToHunt { //다중상속

	@Override
	public void hunt() {
		System.out.println();		
	}

	@Override
	public void fly() {
		System.out.println();		
	}
}
