package proxy1_OOP;

import java.util.Random;

public class Programmer {
	
	public void coding() {
		System.out.println("컴퓨터 켜기"); //이전에 해야 할 것
		
		try {
		System.out.println("열심히 코드를 작성"); //핵심 관심사항
		if(new Random().nextBoolean()) throw new OuchException();
		System.out.println("GIT에 push"); //아무 이상 없이 핵심 관심사항을 마쳤을 때
		
		} catch (OuchException e) {
			System.out.println("반차를 내고 튄다"); //문제가 있었을 때
		} finally {
			System.out.println("보람찬 하루를 마무리"); //모든게 끝났을 때
		}

	}
}
