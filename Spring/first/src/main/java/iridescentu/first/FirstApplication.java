package iridescentu.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
	}
	
	@Bean
	public ServletRegistrationBean<MyServlet> myServlet() {
		ServletRegistrationBean<MyServlet> registrationBean = 
				new ServletRegistrationBean<>(new MyServlet(), "/my-servlet");
		return registrationBean;
	}

}
