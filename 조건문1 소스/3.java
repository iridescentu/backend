public void practice3() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�������� : ");
	int kor = sc.nextInt();
	System.out.print("�������� : ");
	int eng = sc.nextInt();
	System.out.print("�������� : ");
	int math = sc.nextInt();
	
	boolean flag = false;
	int sum = kor + eng + math;
	double avg = sum / 3;
	if (avg >= 60) {
		if (kor >= 40 && eng >= 40 && math >= 40 ) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("�հ� : " + sum);
			System.out.printf("��� : %.1f\n", avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else flag = true;
	} else flag = true;
	if (flag) System.out.println("���հ��Դϴ�.");
	
	sc.close();
}