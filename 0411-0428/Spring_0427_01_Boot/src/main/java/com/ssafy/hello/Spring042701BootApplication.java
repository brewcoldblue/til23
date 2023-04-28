package com.ssafy.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring042701BootApplication {

	//ctrl + F11 -> spring boot app
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring042701BootApplication.class, args);
		
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
