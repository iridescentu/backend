import java.util.Scanner;
public class practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int grade;

        System.out.println("Enter your exam grade: ");
        grade = s.nextInt();

        if (grade >= 60 && grade <= 100) {
                System.out.println("Pass!");
        } else if (grade < 60 && grade >= 0) {
                System.out.println("Fail.");
        } else if (grade < 0 || grade > 100) {
                System.out.println("Enter valuable grade between 0 to 100.");
        }


        s.close();

	}

}
