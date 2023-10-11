import java.util.Scanner;
public class Lab06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int student = 1;
		int result = 1;
		
		System.out.println("도시락을 받으려는 학생의 수를 입력해 주세요: ");
		student = s.nextInt();
		
		for (int i = 1; i <= student; i++) {
			result *= i;
		}
		
		System.out.println("도시락을 받기 위해 학생들이 줄을 설 수 있는 경우의 수는 " + result + " 가지입니다.");
		
	}

}
