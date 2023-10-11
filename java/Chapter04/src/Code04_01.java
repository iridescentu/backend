
public class Code04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 127; // byte형의 최대값
		short birth = 32767; // short형의 최대값
		int money = 2147483647; // int형의 최대값
		
		System.out.println((byte)(age + 1));
		System.out.println((short)(birth + 1));
		System.out.println((int)(money + 1));
	}

}

// 정수형 예제: 데이터형의 값을 초과하는 경우