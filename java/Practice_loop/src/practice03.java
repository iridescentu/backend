import java.util.Scanner;
public class practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("Please enter one of the integer number: ");
        num = s.nextInt();

        for(int i = 0; i < num; i++) {
                sum += (i + 1);

                System.out.print(i + 1);

                if (i + 1 == num) {
                        System.out.print(" = ");
                } else {
                        System.out.print(" + ");
                }
        }

        System.out.print(sum);

        s.close();

	}

}
