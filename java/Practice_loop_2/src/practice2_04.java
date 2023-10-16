import java.util.Scanner;
public class practice2_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("Enter the number: ");
        num = s.nextInt();

        for (int i = 1; i <= num; i++) {
                if (i >= 7 && i % 7 == 0) {
                        sum += i;
                }
        }
        System.out.println("sum = " + sum);

        s.close();

	}

}
