import java.util.Scanner;
 
public class ex06 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("���� 3�� �Է�: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        
        int max = num1;
        int min = num1;
        
        // �ִ밪 
        if (max < num2) max = num2;
        if (max < num3) max = num3;
        
        // �ּҰ� 
        if (min > num2) min = num2;
        if (min > num3) min = num3;
        
        String msg = "�ִ밪: " + max +
                     "\n�ּҰ�: " + min +
                     "\n�հ�: " + sum +
                     "\n���: " + String.format("%.1f", avg);
        
        System.out.println(msg);
        
    }
}