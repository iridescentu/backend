import java.util.Scanner;

public class Code03_05 {

	public static void main(String[] args) {
		// 사용자에게 입력값 받기
		Scanner s= new Scanner(System.in);
		
		// 변수 선언
		int coffee, kimbap, milk, dosirak, coke, snack;
		
		// 사용자에게 입력값 받기
		System.out.println("구매를 원하시는 상품의 수를 입력해 주세요.");
		System.out.println("구매를 원하시는 캔커피의 수량을 입력해 주세요.");
		coffee = s.nextInt();
		System.out.println("구매를 원하시는 삼각김밥의 수량을 입력해 주세요.");
		kimbap = s.nextInt();
		System.out.println("구매를 원하시는 바나나우유의 수량을 입력해 주세요.");
		milk = s.nextInt();
		System.out.println("구매를 원하시는 도시락의 수량을 입력해 주세요.");
		dosirak = s.nextInt();
		System.out.println("구매를 원하시는 콜라의 수량을 입력해 주세요.");
		coke = s.nextInt();
		System.out.println("구매를 원하시는 새우깡의 수량을 입력해 주세요.");
		snack = s.nextInt();
	
		
		// 각각의 상품 가격 출력을 위한 계산식
		int priCoffee, priKimbap, priMilk, priDosirak, priCoke, priSnack;
		priCoffee = 1800 * coffee;
		priKimbap = 1400 * kimbap;
		priMilk = 1800 * milk;
		priDosirak = 4000 * dosirak;
		priCoke = 1500 * coke;
		priSnack = 2000 * snack;
		
		// 각각의 상품 가격 출력
		System.out.println("캔커피 " + coffee + " 개는 " + priCoffee + " 원입니다.");
		System.out.println("삼각김밥 " + kimbap + " 개는 " + priKimbap + " 원입니다.");
		System.out.println("바나나우유 " + milk + " 개는 " + priMilk + " 원입니다.");
		System.out.println("도시락 " + dosirak + " 개는 " + priDosirak + " 원입니다.");
		System.out.println("콜라 " + coke + " 개는 " + priCoke + " 원입니다.");
		System.out.println("새우깡 " + snack + " 개는 " + priSnack + " 원입니다.");
		
		// 총매출액 변수 total을 0으로 설정
		int total = 0;
		
		// 상품의 총액 출력을 위한 계산식
		total = priCoffee + priKimbap + priMilk + priDosirak + priCoke + priSnack;
		
		// 상품의 총액 출력
		System.out.println("고객님께서 결제하실 총 금액은 " + total + " 원입니다.");
		
		s.close();
	}

}
