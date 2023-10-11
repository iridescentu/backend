import java.util.Scanner;
 
public class ex06 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 3개 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;
        
        int max = num1;
        int min = num1;
        
        // 최대값 
        if (max < num2) max = num2;
        if (max < num3) max = num3;
        
        // 최소값 
        if (min > num2) min = num2;
        if (min > num3) min = num3;
        
        String msg = "최대값: " + max +
                     "\n최소값: " + min +
                     "\n합계: " + sum +
                     "\n평균: " + String.format("%.1f", avg);
        
        System.out.println(msg);
        
    }
}