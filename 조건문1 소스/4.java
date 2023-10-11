public void practice4() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1~12 사이의 정수 입력 : ");
	int month = sc.nextInt();
	
	int result = 0;
	boolean flag = true;
	switch(month) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
		result = 31; break;
	case 2: case 4: case 6: case 9: case 11: 
		result = 30; break;
	default: 
		System.out.println(month + "월은 잘못 입력된 달입니다.");
		flag = false;
	}
	if (flag) System.out.println(month + "월은 " + result + "일까지 있습니다.");
	
	sc.close();
}