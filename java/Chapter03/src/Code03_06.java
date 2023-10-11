import java.util.Scanner;

public class Code03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int score;
		
//		System.out.print("필기 시험 점수를 입력하세요: ");
//		score = s.nextInt();
//		System.out.println(score >= 70);
		
		System.out.print("필기 시험 점수를 입력하세요: ");
		score = s.nextInt();
		
		if(score >= 70) {
			System.out.println("축하합니다! 귀하는 운전면허 필기 시험에 합격하셨습니다.");
		} else if(score < 0) {
			System.out.println("장난치지 말고 0 이상의 점수를 입력해 주세요.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		s.close();
	}

}

// 운전면허 필기 시험 점수 확인하기