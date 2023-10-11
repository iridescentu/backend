import java.util.Scanner;
public class Code02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		double num;
		System.out.println("실수를 입력하세요: ");
		num = s.nextDouble();
		System.out.println("사용자가 입력한 값 ==> " + num);
		
		String str;
		System.out.print("문자열을 입력하세요: ");
		str = s.next();
		System.out.println("사용자가 입력한 값 ==> " + str);
		
		s.close();
	}

}

// 사용자가 입력한 숫자 출력