
public class Code02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		double num2;
		String str;
		
		str = "1234";
		num1 = Integer.parseInt(str);
		System.out.println("문자열 ==> 정수: " + num1);
		
		str = "3.14";
		num2 = Double.parseDouble(str);
		System.out.println("문자열 ==> 실수: " + num2);

	}

}

// 문자열을 숫자로 변환하는 method