public void practice6() {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	int num2;
	char op;
	double result = 0;
	boolean flag = true;
	
	System.out.print("피연산자1 입력 : ");
	num1 = sc.nextInt();
	
	if (num1 < 0)
		System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
	else {
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		op = sc.next().charAt(0);
		
		if (num1 == 0 && op == '/')
			System.out.println("0은 나눌 수 없습니다.");
		else {
			switch(op) {
			case '+': case '-': case '*': case '/': case '%': 
				System.out.print("피연산자2 입력 : ");
				num2 = sc.nextInt();
				
				if (num2 < 0) {
					System.out.println("피연산자는 0보다 크거나 같은 수만 입력해주세요.");
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
						System.out.println("0으로 나눌 수 없습니다.");
					break;
				}
			default: System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	sc.close();
}