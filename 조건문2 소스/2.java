import java.util.Scanner;
 
public class ex02 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
String grade = sc.nextLine();

switch(grade) {
case "������":
    System.out.print("ȸ������, �Խñ� ���� ");
case "ȸ��":
    System.out.print("�Խñ� �ۼ�, ��� �ۼ� ");
case "��ȸ��":
    System.out.print("�Խñ� ��ȸ");
}
sc.close();