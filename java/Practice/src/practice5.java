import java.util.Scanner;
public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        double mid, finals, assign, attend;
        double total;

        System.out.println("Enter your midterm score: ");
        mid = s.nextInt();

        System.out.println("Enter your final score: ");
        finals = s.nextInt();

        System.out.println("Enter your assignment score: ");
        assign = s.nextInt();

        System.out.println("Enter your number of attendance: ");
        attend = s.nextInt();

        mid = mid * 0.2;
        finals = finals * 0.3;
        assign = assign * 0.3;

        total = mid + finals + assign + attend;

        System.out.println("========= Your Result =========");

        if (total >= 70 && attend > 10) {
                System.out.println("Midterm score(20): " + mid);
                System.out.println("Final score(30): " + finals);
                System.out.println("Assignment score(30): " + assign);
                System.out.println("Number of attendance(20): " + attend);
                System.out.println("Total: " + total);
                System.out.println("Pass");
        } else if (total < 70 && attend > 10) {
            System.out.println("Midterm score(20): " + mid);
            System.out.println("Final score(30): " + finals);
            System.out.println("Assignment score(30): " + assign);
            System.out.println("Number of attendance(20): " + attend);
            System.out.println("Total: " + total);
            System.out.println("Fail [Underscored]");
        } else if (attend <= 10) {
            System.out.println("Fail [Lack of attendance (" + attend + "/20)");
        }

        s.close();


	}

}
