import java.util.Scanner;
 
public class ex03 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = sc.nextInt();
                
        String msg = "50 미만입니다.";
        if (num >= 50) {
            msg = "50 이상입니다.";
        }
        
        System.out.println("입력하신 정수는 " + msg);
        
        sc.close();
    }
}