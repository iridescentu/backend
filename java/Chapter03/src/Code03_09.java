
public class Code03_09 {

	public static void main(String[] args) {
		
		// 세 과목(java, moblie, excel)의 학점 정의
		int java = 3, mobile = 2, excel = 1;
		
		// 세 과목(java, mobile, excel)의 점수 정의
		double A = 4.5, A0 = 4.0, B = 3.5;
		
		// GPA 변수 선언
		double gpa;
		
		// GPA 구하기 위한 수식
		gpa = ((java * B) + (mobile * A0) + (excel * A)) / (java + mobile + excel);
		
		// GPA을 그대로 출력하면 소수점 아래 숫자가 너무 길어지기 때문에 소수점 아래 두 자리까지 출력하기 위한 수식
		gpa = Math.round(gpa * 100.0) / 100.0;
		
		// GPA 출력하기
		System.out.println("GPA: " + gpa);
	}

}

// 평균 학점 구하기