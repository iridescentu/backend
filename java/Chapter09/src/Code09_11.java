import java.util.Arrays;

public class Code09_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String[] oldAry = {"짜장", "탕수육", "군만두"};
			String[] newAry;
			
			newAry = oldAry;
			
			oldAry[0] = "쟁반짜장";
			newAry[1] = "짬뽕";
			
			System.out.println("원본 배열: " + Arrays.toString(oldAry));
			System.out.println("복사 배열: " + Arrays.toString(newAry));
	}

}

// 얕은 복사 (1차원 배열)