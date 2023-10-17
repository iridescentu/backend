
public class Lab09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] wiseSay = {"삶이 있는 한 희망은 있다.", "언제나 현재에 집중할 수 있다면 행복할 것이다.", "신은 용기 있는 자를 결코 버리지 않는다.", "피할 수 없으면 즐겨라.", "행복한 삶을 살기 위해 필요한 것은 거의 없다.", "내일은 내일의 태양이 뜬다.", "계단을 밟아야 계단 위에 올라설 수 있다.", "행복은 습관이다. 그것을 몸에 지녀라.", "1 퍼센트의 가능성, 그것이 나의 길이다.", "종종 작은 기회로부터 위대한 업적이 시작된다."};
		
		int today = (int)(Math.random() * wiseSay.length);
		System.out.println("오늘의 명언 ==> " + wiseSay[today]);
		
	}

}
