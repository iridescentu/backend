package CarExample;

class Car1 {
	String company = "현대자동차";
	String model = "그랜저";
	String color = "Black";
	int maxSpeed = 350;
	int speed = 0;
}

public class Car {
	
	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		// Car 객체의 필드값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);
		
		// Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}
}