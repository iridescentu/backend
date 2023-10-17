import java.util.Arrays;

public class Code09_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] A = {"졸리네요", "너무너무", "진짜진짜", "많이많이", "집 갈래"};
		String[] B = A.clone();
		// clone() 메소드는 배열에만 사용하는 것이 좋다.
		// 복사하는 대상이 배열이 아니면 복사 생성자, 복사 팩터리가 좋다.
		
		B[0] = "졸려";
		
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("B: " + Arrays.toString(B));
	}

}

// 깊은 복사 (1차원 배열)