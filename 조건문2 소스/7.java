import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		System.out.print("������ �� ���ΰ���? ");
		int month = sc.nextInt();
				
		if (month==12 || month==1 || month==2) {
			System.out.println(month + "���� �ܿ��Դϴ�.");
		} else if (month==3 || month==4 || month==5) {
			System.out.println(month + "���� ���Դϴ�.");
		} else if (month==6 || month==7 || month==8) {
			System.out.println(month + "���� �����Դϴ�.");
		} else if (month==9 || month==10 || month==11) {
			System.out.println(month + "���� �����Դϴ�.");
		} else {	// ���� ������ ��� ������Ű�� ������ ��
			System.out.println(month + "�ٽ� �Է����ּ���.");
		}

	}

}