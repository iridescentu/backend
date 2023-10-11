import java.util.Scanner;
public class Code02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int number1, number2;
		int resAdd;
		int resSub;
		int resMul;
		double resDiv; // 나누기는 double을 사용해 실수로 만들어야 값이 0.1, 3.2처럼 소수점이 존재할 때 정수가 나오지 않음
		int resRem;
		
		System.out.print("정수1 ==> ");
		number1 = s.nextInt();
		
		System.out.print("정수2 ==> ");
		number2 = s.nextInt();
		
		resAdd = number1 + number2;
		resSub = number1 - number2;
		resMul = number1 * number2;
		resDiv = (double) number1 / number2;
		resRem = number1 % number2;
		
		System.out.println(number1 + " + " + number2 + " = " + resAdd);
		System.out.println(number1 + " - " + number2 + " = " + resSub);
		System.out.println(number1 + " * " + number2 + " = " + resMul);
		System.out.println(number1 + " / " + number2 + " = " + resDiv);
		System.out.println(number1 + " % " + number2 + " = " + resRem);
	}

}

// 사용자가 숫자를 입력해 더하기, 빼기, 곱하기, 나누기, 나머지를 계산해 주는 프로그램 만들기