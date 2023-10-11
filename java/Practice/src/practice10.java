import java.util.Scanner;
public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter one of integer number: ");
        num = s.nextInt();

        if((num%3) == 0) {
                System.out.println("The number you entered is a multiple of 3.");
        } else {
                System.out.println("The number you entered is not a multiple of 3.");
        }


        s.close();

	}

}
