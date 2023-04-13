package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/**
		 * 핵심 관심사항은 나머지 파일에 구현되어 있고
		 * Aspect(공통 관심사항) 구현해야 함 (MyAspect.java)
		 */
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		//컨테이너 빌드됨
		
		Person p = ctx.getBean("ssafy", Person.class);
		//이거 SSAFY.class로 바꾸면 프록시 없다고 난리남. 그러면 ac.xml에 가서 인터페이스 구현체가 아닌 CGLIB 프록시를
		//쓴다는 의미로 <aop:aspectj-autoproxy proxy-target-class="true" />를 넣어주면 됨
		try {
			p.coding();
		} catch (OuchException e) {
//			e.printStackTrace();
		}
		//ssafy만 가져왔는데, 부팅 - git push - 하루 마무리까지 다 찍힘
		//myAspect와 합쳐서 advice가 적용된 AOP proxy를 실행시켜가지고...ㅇㅇ...		
	}
}
