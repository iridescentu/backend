import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("DB 점수를 입력하세요 : ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조 점수를 입력하세요 : ");
		int c = sc.nextInt();
		System.out.print("OS 점수를 입력하세요 : ");
		int os = sc.nextInt();
		System.out.print("데이터 통신 점수를 입력하세요 : ");
		int data = sc.nextInt();
		System.out.print("소프트웨어 공학 점수를 입력하세요 : ");
		int sw = sc.nextInt();
		int score = db + c + os + data + sw;

		if (score<60 || db<8 || c<8 || os<8 || data<8 || sw<8) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}