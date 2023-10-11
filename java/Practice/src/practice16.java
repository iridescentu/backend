import java.util.Scanner;
public class practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int db, cal, os, data, sw, total;

        System.out.println("Grade of DB: ");
        db = s.nextInt();

        System.out.println("Grade of Electronic Data Processing System: ");
        cal = s.nextInt();

        System.out.println("Grade of OS: ");
        os = s.nextInt();

        System.out.println("Grade of Data Communications: ");
        data = s.nextInt();

        System.out.println("Grade of Software Engineering: ");
        sw = s.nextInt();

        total = db + cal + os + data + sw;

        if (db < 8 || cal < 8 || os < 8 || data < 8 || sw < 8 && total >= 60) {
                System.out.println("Fail.");
        } else if (total >= 60) {
                System.out.println("Pass!");
        } else if (total < 60) {
                System.out.println("Fail.");
        }


        s.close();

	}

}
