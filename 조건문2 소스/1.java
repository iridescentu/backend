public class ex01 {
public static void main(String[] args) {
		int hour, min, addmin, time;
		String day= "오전";
		
		System.out.print("시간 입력 : ");
		hour = sc.nextInt();
		if(hour >= 24) {
			System.out.println("24 이하로 시간을 입력하세요"); 
			System.exit(0);
		}
		
		System.out.print("분 입력 : ");
		min = sc.nextInt();
		if(min >= 60) {
			System.out.println("60 이하로 시간을 입력하세요"); 
			System.exit(0);
		}
		
		System.out.print("추가 분 입력 : ");
		addmin = sc.nextInt();
		
		time = min + addmin;
		
		if(time >= 60) {
			int addhour = time / 60;
			time = time % 60;
			hour = hour + addhour;
			
		//	hour++;
		}
		if(hour == 12) {
			day = "오후";
		}else if(hour >=13 && hour < 24){
			hour = hour % 12;
			day = "오후";
		}else if(hour>=0 && hour < 12) {
			day = "오전";
		}else if(hour==24){
			hour = 12;
			day = "오전";
		}else if(hour >= 25) {
			hour = hour % 24;
		}		
		
		System.out.println("현재시간은 "+ day+ " " + hour + "시 " + time+ "분 입니다.");
		
        
 }

}