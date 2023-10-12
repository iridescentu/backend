import java.util.Scanner;
public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the integer number: ");
        num = s.nextInt();

        for (int row = 0; row < num; row++) {
                for (int col = 0; col < num; col++) {
                        if (row == 0 || row == num - 1 || col == 0 || col == num - 1)
                                System.out.print("*");
                        else
                            	System.out.print(" ");
                }
                System.out.println();
        }

        s.close();

	}

}
