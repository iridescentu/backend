public void practice5() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�߰� ��� ���� : ");
	double mid = sc.nextDouble() * 0.2;
	System.out.print("�⸻ ��� ���� : ");
	double fin = sc.nextDouble() * 0.3;
	System.out.print("���� ���� : ");
	double task = sc.nextDouble() * 0.3;
	System.out.print("�⼮ Ƚ�� : ");
	double att = sc.nextDouble();
	
	double sum = mid + fin + task + att;
	System.out.println("================= ��� =================");
	if (att <= (20 * 0.7)) {
		System.out.println("Fail [�⼮ Ƚ�� ���� (" + (int)att + "/20)]");
	} else {
		System.out.printf("�߰� ��� ����(20) : %.1f\n", mid);
		System.out.printf("�⸻ ��� ����(30) : %.1f\n", fin);
		System.out.printf("���� ����		(30) : %.1f\n", task);
		System.out.printf("�⼮ ����		(20) : %.1f\n", att);
		System.out.printf("���� : %.1f\n", sum);
		if (sum >= 70) System.out.println("Pass");
		else System.out.println("Fail [���� �̴�]");
	}
	
	sc.close();
}