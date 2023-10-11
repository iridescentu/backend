import java.util.Scanner;
 
public class ex02 {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("권한을 확인하고자 하는 회원 등급 : ");
String grade = sc.nextLine();

switch(grade) {
case "관리자":
    System.out.print("회원관리, 게시글 관리 ");
case "회원":
    System.out.print("게시글 작성, 댓글 작성 ");
case "비회원":
    System.out.print("게시글 조회");
}
sc.close();