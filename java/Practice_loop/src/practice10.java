import java.util.Scanner;
public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the integer number: ");
        num = s.nextInt();

        for (int i = 0; i < num; i++) {
                for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                }
                System.out.println();
        }

        for (int i = 0; i < num - 1; i++) {
                for (int j = num - 1; j > i; j--) {
                        System.out.print("*");
                }
                System.out.println();
        }

        s.close();

	}

}
