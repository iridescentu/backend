import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("DB ������ �Է��ϼ��� : ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� ���� ������ �Է��ϼ��� : ");
		int c = sc.nextInt();
		System.out.print("OS ������ �Է��ϼ��� : ");
		int os = sc.nextInt();
		System.out.print("������ ��� ������ �Է��ϼ��� : ");
		int data = sc.nextInt();
		System.out.print("����Ʈ���� ���� ������ �Է��ϼ��� : ");
		int sw = sc.nextInt();
		int score = db + c + os + data + sw;

		if (score<60 || db<8 || c<8 || os<8 || data<8 || sw<8) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

	}

}