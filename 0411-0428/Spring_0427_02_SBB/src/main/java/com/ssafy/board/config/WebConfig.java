package com.ssafy.board.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//servlet-context!!!
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
//	<!-- Resolves views selected for rendering by @Controllers to .jsp resources in the /WEB-INF/views directory -->
//	<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//		<beans:property name="prefix" value="/WEB-INF/views/" />
//		<beans:property name="suffix" value=".jsp" />
//	</beans:bean>
	
	@Value("${spring.mvc.view.prefix}") //application.properties의 값 가져옴
	private String prefix;
	@Value("${spring.mvc.view.suffix}")
	private String suffix;
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix(prefix);
		resolver.setSuffix(suffix);
		resolver.setViewClass(JstlView.class);
		//여기 명시하는 순간 application.properties의 jsp view 명시 필요없지만,
		//거기 작성해놓고 불러 쓰는게 나음 (코드 수정보다 설정 파일 수정으로 해결할 수 있다면 그렇게 하기 위함)
		
		return resolver;
	}
//	<!-- Handles HTTP GET requests for /resources/** by efficiently serving up static resources in the ${webappRoot}/resources directory -->
//	<resources mapping="/resources/**" location="/resources/" />
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static");
	}
	
	//인터셉터는 여기에 등록하면 댐이다.
//	interceptor autowired 걸고 아래처럼 추가
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//
//		reistry.addInterceptor(interceptor)
//		.addPathPatterns("/board/*");
//		WebMvcConfigurer.super.addInterceptors(registry);
//	}
}
