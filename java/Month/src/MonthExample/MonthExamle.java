package MonthExample;

import java.util.Calendar;

public class MonthExamle {

	public static void main(String[] args) {
		// Month 열거 타입 변수 선언
		Month today = null;
		
		// Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 달 얻기 (1 ~ 12)
		int month = cal.get(Calendar.MONTH);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
				switch(month) {
				case 0: today = Month.JANUARY; break;
				case 1: today = Month.FEBRUARY; break;
				case 2: today = Month.MARCH; break;
				case 3: today = Month.APRIL; break;
				case 4: today = Month.MAY; break;
				case 5: today = Month.JUNE; break;
				case 6: today = Month.JULY; break;
				case 7: today = Month.AUGUST; break;
				case 8: today = Month.SEPTEMBER; break;
				case 9: today = Month.OCTOBER; break;
				case 10: today = Month.NOVEMBER; break;
				case 11: today = Month.DECEMBER; break;
				}
				
				// 열거 타입 변수를 사용
				if (today == Month.JANUARY) {
					System.out.println("지금은 1월달입니다.");
				} else if (today == Month.FEBRUARY) {
					System.out.println("지금은 2월달입니다.");
				} else if (today == Month.MARCH) {
					System.out.println("지금은 3월달입니다.");
				} else if (today == Month.APRIL) {
					System.out.println("지금은 4월달입니다.");
				} else if (today == Month.MAY) {
					System.out.println("지금은 5월달입니다.");
				} else if (today == Month.JUNE) {
					System.out.println("지금은 6월달입니다.");
				} else if (today == Month.JULY) {
					System.out.println("지금은 7월달입니다.");
				} else if (today == Month.AUGUST) {
					System.out.println("지금은 8월달입니다.");
				} else if (today == Month.SEPTEMBER) {
					System.out.println("지금은 9월달입니다.");
				} else if (today == Month.OCTOBER) {
					System.out.println("지금은 10월달입니다.");
				} else if (today == Month.NOVEMBER) {
					System.out.println("지금은 11월달입니다.");
				} else {
					System.out.println("지금은 12월달입니다.");
				}
	}

}
