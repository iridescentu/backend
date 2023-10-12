import java.util.Scanner;
public class practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the integer number: ");
        num = s.nextInt();

        for (int i = 0; i < num; i++) {
                for (int j = num; j > i; j--) {
                        System.out.print("*");
                }

                System.out.println();
        }

        s.close();

	}

}
