import java.util.Scanner;
public class practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the number: ");
        num = s.nextInt();

        if (num < 2 || num > 9) {
                System.out.println("Please enter the number between 2 to 9.");
        } else {
                for (int i = num; i <= 9; i++) {
                        System.out.println("===== " + i + " =====");
                        for (int j = 0; j < 9; j++)
                                System.out.println(i + " * " + (j + 1) + " = " + i * (j + 1));
                        System.out.println();
                }
        }

        s.close();

	}

}
