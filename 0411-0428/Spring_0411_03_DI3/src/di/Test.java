package di;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Spring Container 객체를 빌드할것
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//resource 폴더도 src와 동일한 폴더로 취급됨
		
		Programmer p = (Programmer) context.getBean("programmer");
		//getBean은 반환형이 Object라서 캐스트가 필요함
		
		Desktop d = context.getBean("desktop", Desktop.class);
		//요런 식으로 아예 특정 클래스로 반환하라고 할 수 있음
		
		p.setComputer(d);
		p.coding();

		//true 왜 주솟값이...같지...? bean scope!
	}
}
