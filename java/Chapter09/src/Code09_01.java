import java.util.Scanner;
public class Code09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		int res = 0;
		
		System.out.print("Number: ");
		num1 = s.nextInt();
		
		System.out.print("Number: ");
		num2 = s.nextInt();
		
		System.out.print("Number: ");
		num3 = s.nextInt();
		
		System.out.print("Number: ");
		num4 = s.nextInt();
		
		res = num1 + num2 + num3 + num4;
		
		System.out.println("Sum ==> " + res);
		
		s.close();
	}

}
