import java.util.Scanner;
public class practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter one of the natural number: ");
        num = s.nextInt();

        int count = 0;

        for (int i = 0; i < num; i++) {
                if ((i + 1) % 2 == 0 || (i + 1) % 3 == 0) {
                        System.out.print(i + 1 + " ");
                        if ((i + 1) % (2 * 3) == 0) count++;
                }
        }
        System.out.println("\ncount: " + count);

        s.close();

	}

}
