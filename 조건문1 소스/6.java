public void practice6() {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	char op;
	double result = 0;
	boolean flag = true;
	
	System.out.print("�ǿ�����1 �Է� : ");
	num1 = sc.nextInt();
	
	if (num1 < 0)
		System.out.println("�ǿ����ڴ� 0���� ũ�ų� ���� ���� �Է����ּ���.");
	else {
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		op = sc.next().charAt(0);
		
		if (num1 == 0 && op == '/')
			System.out.println("0�� ���� �� �����ϴ�.");
		else {
			switch(op) {
			case '+': case '-': case '*': case '/': case '%': 
				System.out.print("�ǿ�����2 �Է� : ");
				num2 = sc.nextInt();
				
				if (num2 < 0) {
					System.out.println("�ǿ����ڴ� 0���� ũ�ų� ���� ���� �Է����ּ���.");
					flag = false;
				}
				else {
					switch(op) {
					case '+': result = num1 + num2; break;
					case '-': result = num1 - num2; break;
					case '*': result = num1 * num2; break;
					case '/':
					if (num2 == 0) flag = false;
					else result = (double)num1 / num2; break;
					case '%':
					if (num2 == 0) flag = false;
					else result = num1 % num2; break;
					}
					
					if (flag)
						System.out.printf("%d %c %d = %f\n", num1, op, num2, result);
					else
						System.out.println("0���� ���� �� �����ϴ�.");
					break;
				}
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	sc.close();
}