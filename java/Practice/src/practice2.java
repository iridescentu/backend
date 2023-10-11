import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int num;

        System.out.print("Enter your number: ");
        num = s.nextInt();

        if (num > 0 && num%2 == 0)
                System.out.println("Your number is even.");
        else if (num > 0 && num%2 == 1)
                System.out.println("Your number is odd.");
        else
            	System.out.println("Please enter positive number.");


        s.close();

	}

}
