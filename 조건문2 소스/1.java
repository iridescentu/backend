public class ex01 {
public static void main(String[] args) {
		int hour, min, addmin, time;
		String day= "����";
		
		System.out.print("�ð� �Է� : ");
		hour = sc.nextInt();
		if(hour >= 24) {
			System.out.println("24 ���Ϸ� �ð��� �Է��ϼ���"); 
			System.exit(0);
		}
		
		System.out.print("�� �Է� : ");
		min = sc.nextInt();
		if(min >= 60) {
			System.out.println("60 ���Ϸ� �ð��� �Է��ϼ���"); 
			System.exit(0);
		}
		
		System.out.print("�߰� �� �Է� : ");
		addmin = sc.nextInt();
		
		time = min + addmin;
		
		if(time >= 60) {
			int addhour = time / 60;
			time = time % 60;
			hour = hour + addhour;
			
		//	hour++;
		}
		if(hour == 12) {
			day = "����";
		}else if(hour >=13 && hour < 24){
			hour = hour % 12;
			day = "����";
		}else if(hour>=0 && hour < 12) {
			day = "����";
		}else if(hour==24){
			hour = 12;
			day = "����";
		}else if(hour >= 25) {
			hour = hour % 24;
		}		
		
		System.out.println("����ð��� "+ day+ " " + hour + "�� " + time+ "�� �Դϴ�.");
		
        
 }

}