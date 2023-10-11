import java.util.Scanner;
public class practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int a, b, c, min, max;
        double avg;

        System.out.println("Enter your first integer number: ");
        a = s.nextInt();

        System.out.println("Enter your second integer number: ");
        b = s.nextInt();

        System.out.println("Enter your third integer number: ");
        c = s.nextInt();

        min = a;

        if (min > b)
                min = b;
        if (min > c)
                min = c;
        System.out.println("Minimum number is " + min);

        max = a;

        if (max < b)
                max = b;
        if (max < c)
                max = c;
        System.out.println("Maximum number is " + max);

        avg = (a + b + c) / 3;

        System.out.println("Average of three numbers are: " + avg);
        
        s.close();

	}

}
