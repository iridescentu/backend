import java.util.Scanner;
public class Code09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int[] numAry = new int[4];
		int sum = 0;
		
		for (int i = 0; i <= 3; i++) {
			System.out.print("Number: ");
			numAry[i] = s.nextInt();
		}
		
		sum = numAry[0] + numAry[1] + numAry[2] + numAry[3];
		System.out.println("Sum ==> " + sum);
		
		s.close();
	}

}
