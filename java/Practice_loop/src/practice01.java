import java.util.Scanner;
public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num;

        System.out.println("Enter your number(has to be bigger than 0): ");
        num = s.nextInt();

        for(int i = 1; i < num+1; i++) {
                System.out.print(i + " ");
        }
                if (num < 1) {
                        System.out.println("Enter the bigger number than 0.");

        }

        s.close();

	}

}
