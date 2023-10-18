package Personal;

import java.util.Scanner;

import Personal.Overwatch;

public class Personal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Hello 출력
		System.out.println("Hello!");
		
		// 변수 선언
		int select;
		int question;
		int owQues;
		
		// Scanner로 사용자에게 입력값 받기
		System.out.println("Do you like to playing Overwatch?");
		System.out.print("1. Yes \n2. No");
		System.out.println();
		question = s.nextInt();
		
		// if문 작성
		if (question == 1) {
			System.out.println("I like to playing Overwatch, too!");
		} else {
			System.out.println("Think again.");
			return;
		}
		
		// switch의 case 2 번에 사용하기 위한 Overwatch class 불러오기
		Overwatch ow = new Overwatch();
		
		// switch문 작성
		System.out.println("Do you know about the Overwatch? \n1. Yes \n2.No");
		owQues = s.nextInt();
		switch(owQues) {
		case 1: 
			System.out.println("Nice!");
			break;
		case 2:
			System.out.println("Then, I will let you know some informations of Overwatch!");
			System.out.println("Name: " + ow.name);
			System.out.println("Company: " + ow.company);
			System.out.println("Genre: " + ow.genre);
			System.out.println("Platform: " + ow.platform);
			System.out.println("Year: " + ow.year);
			break;
		default: 
			System.out.println("Choose the number of 1 or 2.");
			break;
		}
		
//		// 유저의 오버워치 메인 포지션 티어를 묻기 위한 Scanner
//		System.out.println("What is the tier of your main position?");
//		System.out.println("1. Grandmaster \n2. Master \n3. Diamond \n4. Platinum \n5. Gold \n6. Silver \n7. Bronze");
//		int tier = s.nextInt();
//		
//		// 유저의 티어와 내 티어 비교를 위한 for문 작성
//		for (int i = );
		
		
		// 메인 포지션을 묻기 위한 Scanner 입력값 받기
		System.out.println("What is your main position in Overwatch?");
		System.out.print("1. Tank \n2. Damage \n3. Support");
		select = s.nextInt();
		
		// 포지션별 영웅 리스트를 위한 배열
		String[] tank = {"D.Va", "Doomfist", "Ramattra", "Reinhardt", "Wrecking Ball", "Roadhog", "Sigma", "Orisa", "Winston", "Zarya", "Junker Queen"};
		String[] dps = {"Genji", "Reaper", "Mei", "Bastion", "Sojourn", "Soldier: 76", "Sombra", "Symmetra", "Ashe", "Echo", "Widowmaker", "Junkrat", "Cassidy", "Torbjorn", "Tracer", "Pharah", "Hanzo"};
		String[] healer = {"Lifeweaver", "Lucio", "Mercy", "Moira", "Baptiste", "Brigitte", "Ana", "Illari", "Zenyatta", "Kiriko"};
		
		// switch문 작성
		switch(select) {
		case 1: 
			System.out.println("Ok, your main position is Tank. Then what is your favorite Tank Character?");
			System.out.println("Tank Characters are: ");
			for (int i = 0; i < tank.length; i++) {
				System.out.print(tank[i] + " ");
				System.out.println();
			}
//		case 2:
//			System.out.println
			
		}

	}

}
