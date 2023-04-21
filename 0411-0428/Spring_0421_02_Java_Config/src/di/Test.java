package di;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		//Spring Container 객체를 빌드할것
//		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//저 자바 파일을 읽어가지고 컨테이너 만듬

		Desktop d1 = context.getBean("desktop", Desktop.class);
		
		Programmer p1 = context.getBean("p", Programmer.class);
		//getBean의 리턴은 object
		System.out.println(p1);
		p1.coding();
	}
}
