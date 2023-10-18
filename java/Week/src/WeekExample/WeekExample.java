package WeekExample;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// Week 열거 타입 변수 선언
		Week today = null;
		
		// Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기 (1 ~ 7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		// 열거 타입 변수를 사용
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 넷플릭스를 봅니다.");
		} else if (today == Week.MONDAY) {
			System.out.println("월요일에는 학원 가기 싫어요.");
		} else if (today == Week.TUESDAY) {
			System.out.println("화요일에는 집에서 자고 싶어요.");
		} else if (today == Week.WEDNESDAY) {
			System.out.println("수요일에는 내 50 만 원의 행방을 찾아서");
		} else if (today == Week.THURSDAY) {
			System.out.println("목요일에는...... 그냥 집에 갈래");
		} else if (today == Week.FRIDAY) {
			 System.out.println("마침내 금요일");
		} else {
			System.out.println("토요일에는 알바 가야 돼......");
		}
	}

}
