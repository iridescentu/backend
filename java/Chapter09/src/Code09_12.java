import java.util.Arrays;

public class Code09_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ary1 = {"졸리다", "집에", "가고", "싶다"};
		String[] ary2;
		
		ary2 = ary1;
		
		ary1[0] = "너무 졸리다 쿨쿨";
		ary2[1] = "집";
		
		System.out.println("원본 배열: " + Arrays.toString(ary1));
		System.out.println("복사 배열: " + Arrays.toString(ary2));
	}

}

// 얕은 복사 (1차원 배열)