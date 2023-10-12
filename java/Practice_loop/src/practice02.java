import java.util.Scanner;
public class practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Enter the number(has to be bigger than 0): ");
        num = s.nextInt();

        for (int i = num; i > 0; i--) {
                System.out.print(i + " ");
        }

        if (num < 1) {
                System.out.println("Please enter the number bigger than 0.");
        }

        s.close();

	}

}
