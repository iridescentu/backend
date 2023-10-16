import java.util.Scanner;
public class practice2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter the number: ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {
                if (i % 2 == 1) {
                        System.out.println(i + " ");
                }
        }

        s.close();

	}

}
