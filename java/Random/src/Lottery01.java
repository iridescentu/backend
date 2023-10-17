import java.util.Random;
public class Lottery01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random(); // 랜덤 객체 생성
		
		for (int i = 0; i < 6; i++) {
			System.out.print("[" + (rd.nextInt(45) + 1) + "]"); // 로또 번호 출력
		}
	}

}
