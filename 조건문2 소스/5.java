import java.util.Scanner;
 
public class ex05 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("���� �Է�: ");
        int num = sc.nextInt();
        
        String msg = "3�� ����� �ƴմϴ�.";
        if (num % 3 == 0) {
            msg = "3�� ��� �Դϴ�.";
        }
        
        System.out.println("�Է��Ͻ� ������ " +  msg);
        
        sc.close();
    }
}
