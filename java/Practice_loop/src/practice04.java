import java.util.Scanner;
public class practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int input1, input2;

        System.out.println("Enter the first number: ");
        input1 = s.nextInt();

        System.out.println("Enter the second number: ");
        input2 = s.nextInt();

        int num1, num2;

        if (input1 < 1 || input2 < 1) {
                System.out.println("Enter the number that is bigger than 1.");
        } else {
                if (input1 < input2) {
                        num1 = input1;
                        num2 = input2;
                } else {
                        num1 = input2;
                        num2 = input1;
                }

                for (int i = num1; i <= num2; i++) {
                        System.out.print(i + " ");
                }
        }
        s.close();

	}

}
