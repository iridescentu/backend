import java.util.Scanner;
public class practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the number: ");
        num = s.nextInt();

        System.out.println("===== " + num + " =====");

        for(int i = 0; i < 9; i++) {
                System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
        }

        s.close();

	}

}
