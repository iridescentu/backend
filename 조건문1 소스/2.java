public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
	int num = sc.nextInt();
	
	if (num > 0) {
		if (num % 2 == 0)
			System.out.println("¦���Դϴ�.");
		else
			System.out.println("Ȧ���Դϴ�.");
	} else
		System.out.println("����� �Է����ּ���.");
	
	sc.close();
}