import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		System.out.print("지금은 몇 월인가요? ");
		int month = sc.nextInt();
				
		if (month==12 || month==1 || month==2) {
			System.out.println(month + "월은 겨울입니다.");
		} else if (month==3 || month==4 || month==5) {
			System.out.println(month + "월은 봄입니다.");
		} else if (month==6 || month==7 || month==8) {
			System.out.println(month + "월은 여름입니다.");
		} else if (month==9 || month==10 || month==11) {
			System.out.println(month + "월은 가을입니다.");
		} else {	// 위의 조건을 모두 충족시키지 못했을 때
			System.out.println(month + "다시 입력해주세요.");
		}

	}

}