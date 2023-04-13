package proxy2_AOP;

import java.util.Random;

import proxy1_OOP.OuchException;

public class PersonProxy implements Person {
	private Person person;

	@Override
	public void coding() { //오버라이드하면서

		
		System.out.println("컴퓨터 켜기"); //이전에 해야 할 것
		
		try {
			person.coding();
			//핵심 관심사항을 이렇게 호출함. person의 coding()이 되니까
			//person이 SSAFY인지 Programmer인지에 따라 다른 내용이 출력될 것.
			
		if(new Random().nextBoolean()) throw new OuchException();
		System.out.println("GIT에 push"); //아무 이상 없이 핵심 관심사항을 마쳤을 때
		
		} catch (OuchException e) {
			System.out.println("반차를 내고 튄다"); //문제가 있었을 때
		} finally {
			System.out.println("보람찬 하루를 마무리"); //모든게 끝났을 때
		}
	}
	
	//의존성 주입 해야함 (설정자 주입)
	
	public void setPerson(Person p) {
		this.person = p;
	}
	
}
