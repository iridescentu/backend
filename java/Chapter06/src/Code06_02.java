import java.util.Scanner;
public class Code06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("첫 번째 숫자를 입력해 주세요: ");
		num1 = s.nextInt();
		System.out.println("두 번째 숫자를 입력해 주세요: ");
		num2 = s.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(num1 += num2);
		}
		
		s.close();
	}

}
