import java.util.Arrays;
import java.util.Collections;


public class Lab09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] toss = new String[10000];
		String comA, comB;
		int aWin, bWin, noWin;
		
		String[] strAry = {"가위", "바위", "보"};
		
		for (int i = 0; i < 10000; i++) {
			comA = strAry [(int)(Math.random() * strAry.length)];
			comB = strAry [(int)(Math.random() * strAry.length)];
			
			if (comA == "가위") {
				if (comB == "가위") {
					toss[i] = "없음";
				} else if (comB == "바위") {
					toss[i] = "B";
				} else if (comB == "보") {
					toss[i] = "A";
				}
			} else if (comA == "바위") {
				if (comB == "가위") {
					toss[i] ="A";
				} else if (comB == "바위") {
					toss[i] = "없음";
				} else if (comB == "보") {
					toss[i] = "B";
				}
			} else if (comA == "보") {
				if (comB == "가위") {
					toss[i] = "B";
				} else if (comB == "바위") {
					toss[i] = "A";
				} else if (comB == "보") {
					toss[i] = "없음";
				}
			}
		}
		
		aWin = Collections.frequency(Arrays.asList(toss), "A");
		bWin = Collections.frequency(Arrays.asList(toss), "B");
		noWin = Collections.frequency(Arrays.asList(toss), "없음");
		
		System.out.println("10000 번 중 컴퓨터 A의 승리: " + aWin);
		System.out.println("10000 번 중 컴퓨터 B의 승리: " + bWin);
		System.out.println("10000 번 중 비긴 경기: " + noWin);
	}

}
