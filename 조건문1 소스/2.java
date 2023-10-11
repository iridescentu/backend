public void practice2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 한 개 입력하세요 : ");
	int num = sc.nextInt();
	
	if (num > 0) {
		if (num % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	} else
		System.out.println("양수만 입력해주세요.");
	
	sc.close();
}