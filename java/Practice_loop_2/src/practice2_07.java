import java.util.Scanner;
public class practice2_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num1, num2;
        double res = 0;

        System.out.println("Enter your first number: ");
        num1 = s.nextInt();

        System.out.println("Enter your second number: ");
        num2 = s.nextInt();

        for (int i = 1; i <= 19; i++) {
                res = Math.pow(num1, num2);
        }
        System.out.println(num1 + " ^ " + num2 + " = " + res);

        s.close();

	}

}
