import java.util.Scanner;
 
public class ex03 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է�: ");
        int num = sc.nextInt();
                
        String msg = "50 �̸��Դϴ�.";
        if (num >= 50) {
            msg = "50 �̻��Դϴ�.";
        }
        
        System.out.println("�Է��Ͻ� ������ " + msg);
        
        sc.close();
    }
}