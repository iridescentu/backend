import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num1, num2;
        double result;
        String sign;

        System.out.println("Enter your first number: ");
        num1 = s.nextInt();

        if (num1 == 0) {
                System.out.println("0 cannot devided.");
                return;
        }

        System.out.println("Enter your operator(Choose from +, -, *, /, %): ");
        sign = s.next();

        if(sign.equals("!")) {
                System.out.println("You chose wrong operator.");
                return;
        }

        System.out.println("Enter your second number: ");
        num2 = s.nextInt();

//        result = num1 / num2;
//        resultS = String.format("%f", result);
        
        	result = (double) num1 / num2;
        	String resultS = String.format("%.6f", result);
        	
        	
        if(sign.equals("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (sign.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (sign.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (sign.equals("/")) {
            System.out.println(num1 + " / " + num2 + " = " + resultS);
        } else if (sign.equals("%")) {
            System.out.println(num1 + " % " + num2 + " = " + (num1 %  num2));
        }

    s.close();

	}

}
