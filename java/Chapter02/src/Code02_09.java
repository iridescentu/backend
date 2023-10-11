import java.util.Scanner;
public class Code02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		String personName, personAddr;
		int weight;
		
		System.out.println("##택배를 보내시려면 아래 항목을 작성해 주세요.");
		
		System.out.print("받는 사람: ");
		personName = s.nextLine();
		
		System.out.print("주소: ");
		personAddr = s.nextLine();
		
		System.out.print("무게(g): ");
		weight = s.nextInt();
		
		System.out.println("** 받는 사람 ==> " + personName);
		System.out.println("** 주소 ==> " + personAddr);
		System.out.println("** 배송비 ==> " + weight * 5 + "원");
	}

}

// 택배 배송 정보 입력하기