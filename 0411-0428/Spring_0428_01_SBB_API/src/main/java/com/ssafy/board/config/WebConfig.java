package com.ssafy.board.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

//servlet-context!!!
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

//	<!-- Handles HTTP GET requests for /resources/** by efficiently serving up static resources in the ${webappRoot}/resources directory -->
//	<resources mapping="/resources/**" location="/resources/" />
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static");
		//++
		registry.addResourceHandler("/swagger-ui/**").addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
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
	
	//CORS를 컨트롤러마다 설정할 수도 있지만 여기서 한방에 설정도 쌉가능.
	public void addCorsMapping(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST");
	}
}
