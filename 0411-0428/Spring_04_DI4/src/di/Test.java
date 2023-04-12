package di;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Spring Container 객체를 빌드할것
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		//resource 폴더도 src와 동일한 폴더로 취급됨
		
		Programmer p = context.getBean("p", Programmer.class);
		//getBean의 리턴은 object
		p.coding();

	}
}
