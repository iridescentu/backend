import java.util.Arrays;
import java.util.Collections;
public class Code09_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numAry = {3, 5, 1, 9, 7};
		
		System.out.print("원본 숫자: ");
		for (int data: numAry) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		Arrays.sort(numAry);
		System.out.print("오름차순: ");
		for (int data: numAry) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		
		System.out.print("내림차순: ");
		Integer[] numAry2 = Arrays.stream(numAry).boxed().toArray(Integer[]::new);
		Arrays.sort(numAry2, Collections.reverseOrder());
		for (int data: numAry2) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		
		String[] strAry = {"가나", "삼성", "한국", "엘지", "커피"};
		
		System.out.print("원본 글자: ");
		for (String data: strAry) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		Arrays.sort(strAry);
		System.out.print("오름차순: ");
		for (String data: strAry) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		System.out.print("내림차순: ");
		Arrays.sort(strAry, Collections.reverseOrder());
		for (String data: strAry) {
			System.out.print(data + " ");
		}
			
	}

}
