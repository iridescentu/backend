public void practice3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("국어점수 : ");
	int kor = sc.nextInt();
	System.out.print("영어점수 : ");
	int eng = sc.nextInt();
	System.out.print("수학점수 : ");
	int math = sc.nextInt();
	
	boolean flag = false;
	int sum = kor + eng + math;
	double avg = sum / 3;
	if (avg >= 60) {
		if (kor >= 40 && eng >= 40 && math >= 40 ) {
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			System.out.println("축하합니다, 합격입니다!");
		} else flag = true;
	} else flag = true;
	if (flag) System.out.println("불합격입니다.");
	
	sc.close();
}