package AOP;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person{
	
	@Override
	public int coding() throws OuchException {
		System.out.println("열심히 코드를 작성"); //핵심 관심사항만 가지고 있는다(AOP)
		if(new Random().nextBoolean()) throw new OuchException();
		return (int) (Math.random() * 100) + 1;
	}
}
