import java.util.Scanner;
 
public class ex04 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
        
        String msg = "3의 배수가 아닙니다.";
        if (num % 3 == 0) {
            msg = "3의 배수 입니다.";
        }
        
        System.out.println("입력하신 정수는 " +  msg);
        
        sc.close();
    }
}
