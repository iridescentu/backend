package iridescentu.first.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBusiness {
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	public String toString() {
		return "Using" + dependency1 + " and " + dependency2;
	}
	
	@Autowired
	public MyBusiness(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
}


@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}