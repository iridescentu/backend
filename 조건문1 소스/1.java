public void practice1() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. �Է�");
	System.out.println("2. ����");
	System.out.println("3. ��ȸ");
	System.out.println("4. ����");
	System.out.println("7. ����");
	
	System.out.print("�޴� ��ȣ�� �����ϼ��� : ");
	int select = sc.nextInt();
	
	String result = "";
	switch(select) {
	case 1: result = "�Է�"; break;
	case 2: result = "����"; break;
	case 3: result = "��ȸ"; break;
	case 4: result = "����"; break;
	case 7: System.out.println("���α׷��� ����˴ϴ�."); break;
	default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	switch(select) {
	case 1: case 2: case 3: case 4: 
		System.out.println(result + " �޴��Դϴ�."); break;
	}
	
	sc.close();
}