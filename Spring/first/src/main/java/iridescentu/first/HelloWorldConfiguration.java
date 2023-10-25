package iridescentu.first;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration // Bean method를 정의하기 위해 사용
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Sherlock";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person person() {
		return new Person("Tom", 25, new Address("Main Street", "New York"));
	}
	
	@Bean
	@Primary // 우선 순위를 주는 것. person인 Tom과 person2인 Steve가 있을 때, person2에 @Primary를 달아 주어 person2를 표시되게 만든다
	public Person person2() {
		return new Person("Steve", 17, new Address("Center Rd", "DaeJeon"));
	}
	
	@Bean
	public Person personParams(String name, int age, @Qualifier("address2Qualifier") Address address) {
		return new Person(name(), age(), address());
	}
	
	@Bean(name = "addressBaker") // 같은 이름의 메소드가 있을 수 있기 때문에 Bean에게 name을 부여해 줘서 구분할 수 있다. System.out.println(context.getBean("addressBaker")); 이런 식으로 적어 주면 됨.
	@Qualifier("addressQualifier")
	public Address address() {
		return new Address("Baker Street", "London");
	}
	
	@Bean
	@Qualifier("address2Qualifier")
	public Address address2() {
		return new Address("Baeul-2ro", "Daejeon");
	}
}
