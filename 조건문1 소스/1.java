public void practice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. 입력");
	System.out.println("2. 수정");
	System.out.println("3. 조회");
	System.out.println("4. 삭제");
	System.out.println("7. 종료");
	
	System.out.print("메뉴 번호를 선택하세요 : ");
	int select = sc.nextInt();
	
	String result = "";
	switch(select) {
	case 1: result = "입력"; break;
	case 2: result = "수정"; break;
	case 3: result = "조회"; break;
	case 4: result = "삭제"; break;
	case 7: System.out.println("프로그램이 종료됩니다."); break;
	default: System.out.println("잘못 입력하셨습니다.");
	}
	switch(select) {
	case 1: case 2: case 3: case 4: 
		System.out.println(result + " 메뉴입니다."); break;
	}
	
	sc.close();
}