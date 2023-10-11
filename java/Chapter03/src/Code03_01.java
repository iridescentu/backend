import java.util.Scanner;
public class Code03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n1, n2, res;
//		n1 = 5;
//		n2 = 3;
//		res = n1 + n2;
//		System.out.println(res);
		
		// 사용자에게 입력값 받기
		Scanner s = new Scanner(System.in);
		
		// 변수 선언
		int n1, n2, resAdd, resSub, resMul, resRem;
		double resDiv;
		
		// 사용자에게 입력값 받기
		System.out.println("계산에 사용할 두 숫자가 필요합니다. 아래에 값을 입력해 주세요.");
		System.out.println("첫 숫자를 입력해 주세요.");
		n1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력해 주세요.");
		n2 = s.nextInt();
		System.out.println("아래는 사용자가 입력한 두 수를 이용해 수식이 계산된 결과입니다.");
		
		// 더하기, 빼기, 곱하기, 나누기, 나머지 수식 정의
		resAdd = n1 + n2;
		resSub = n1 - n2;
		resMul = n1 * n2;
		resDiv = (double) n1 / n2;
		resRem = n1 % n2;
		
		// 더하기, 빼기, 곱하기, 나누기, 나머지 결과 도출
		System.out.println(n1 + " + " + n2 + " = " + resAdd);
		System.out.println(n1 + " - " + n2 + " = " + resSub);
		System.out.println(n1 + " * " + n2 + " = " + resMul);
		System.out.println(n1 + " / " + n2 + " = " + resDiv);
		System.out.println(n1 + " % " + n2 + " = " + resRem);
	}

}
