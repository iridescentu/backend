package iridescentu.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Bean method를 정의하기 위해 사용
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "This is bean method";
	}
	
	@Bean
	public int age() {
		return 20;
	}
}
