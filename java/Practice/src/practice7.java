import java.util.Scanner;
public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int hour, min1, min2, time;
        String day = "AM";

        System.out.println("Enter the hour: ");
        hour = s.nextInt();
        if (hour >= 24) {
                System.out.println("Enter the hour below 24.");
                return;
        }

        System.out.println("Enter the minutes: ");
        min1 = s.nextInt();
        if (min1 >= 60) {
                System.out.println("Enter the minutes below 60.");
        }

        System.out.println("Enter the additional minutes: ");
        min2 = s.nextInt();

        time = min1 + min2;

        if (time >= 60) {
                int addHour = time / 60;
                time = time %  60;
                hour = hour + addHour;
        }


        if (hour == 12) {
                day = "PM";
        } else if (hour >= 13 && hour < 24) {
                hour = hour %  12;
                day = "PM";
        } else if (hour >= 0 && hour < 12) {
            day = "AM";
        } else if (hour == 24) {
            hour = 12;
            day = "AM";
        } else if (hour >= 25) {
            hour = hour %  24;
        }


    System.out.println("Add " + min2 + " minutes to your input time, which is " + hour + ":" + time + " " + day + ".");

    s.close();

	}

}
