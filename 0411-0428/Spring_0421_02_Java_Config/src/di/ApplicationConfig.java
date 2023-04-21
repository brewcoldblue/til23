package di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

////이거 스프링 컨테이너 설정 파일입니다
//@Configuration
//public class ApplicationConfig {
//	
//	//bean annotation 달고, desktop이 id가 됨
//	@Bean
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
//	//의존성 주입하려고 ApplicationContext에서 막 뭐... 이것저것 했는데
//	//좀 자바같음! -> POJO 방식을 그대로 사용한 것
//	@Bean
//	public Programmer programmer() {
////		Programmer pr = new Programmer();
////		pr.setComputer(desktop()); //설정자 주입된것
//		
//		Programmer pr = new Programmer(desktop()); //생성자 주입된것
//		return pr;
//	}
//}

//이런 식으로 스캔 조질수도 있다
@Configuration
@ComponentScan(basePackages= {"di"})
public class ApplicationConfig {
	
}

