public void practice5() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("중간 고사 점수 : ");
	double mid = sc.nextDouble() * 0.2;
	System.out.print("기말 고사 점수 : ");
	double fin = sc.nextDouble() * 0.3;
	System.out.print("과제 점수 : ");
	double task = sc.nextDouble() * 0.3;
	System.out.print("출석 횟수 : ");
	double att = sc.nextDouble();
	
	double sum = mid + fin + task + att;
	System.out.println("================= 결과 =================");
	if (att <= (20 * 0.7)) {
		System.out.println("Fail [출석 횟수 부족 (" + (int)att + "/20)]");
	} else {
		System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
		System.out.printf("기말 고사 점수(30) : %.1f\n", fin);
		System.out.printf("과제 점수		(30) : %.1f\n", task);
		System.out.printf("출석 점수		(20) : %.1f\n", att);
		System.out.printf("총점 : %.1f\n", sum);
		if (sum >= 70) System.out.println("Pass");
		else System.out.println("Fail [점수 미달]");
	}
	
	sc.close();
}