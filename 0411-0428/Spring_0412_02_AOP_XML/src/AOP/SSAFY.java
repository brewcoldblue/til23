package AOP;

import java.util.Random;

public class SSAFY implements Person{
	
	public int coding() throws OuchException {
		System.out.println("열심히 싸피에서 공부함"); //핵심 관심사항만 가지고 있는다(AOP)
//		if(new Random().nextBoolean()) throw new OuchException();
		return (int) (Math.random() * 100) + 1;
	}
}
