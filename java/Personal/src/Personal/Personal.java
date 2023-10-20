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
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		
		// if문 작성
		if (question == 1) {
			System.out.println("I like to playing Overwatch, too!");
		} else {
			System.out.println("That's impossible! Think about it again.");
			return;
		}

		
		// switch의 case 2 번에 사용하기 위한 Overwatch class 불러오기
		Overwatch ow = new Overwatch();
		
		// switch문 작성
		System.out.println("Do you know about the Overwatch? \n1. Yes \n2. No");
		owQues = s.nextInt();
		switch(owQues) {
		case 1: 
			System.out.println("Great! Nice to hear that.");
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
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		
//		// 유저의 오버워치 메인 포지션 티어를 묻기 위한 Scanner
//		System.out.println("What is the tier of your main position?");
//		System.out.println("1. Grandmaster \n2. Master \n3. Diamond \n4. Platinum \n5. Gold \n6. Silver \n7. Bronze");
//		int tier = s.nextInt();
//		
//		// 유저의 티어와 내 티어 비교를 위한 for문 작성
//		for (int i = );
		
		
		// 메인 포지션을 묻기 위한 Scanner 입력값 받기
		System.out.println("What is your main position in Overwatch?");
		System.out.println("1. Tank \n2. Damage \n3. Support");
		select = s.nextInt();
		
		// 포지션별 영웅 리스트를 위한 배열
		String[] tank = {"D.Va", "Doomfist", "Ramattra", "Reinhardt", "Wrecking Ball", "Roadhog", "Sigma", "Orisa", "Winston", "Zarya", "Junker Queen"};
		String[] dps = {"Genji", "Reaper", "Mei", "Bastion", "Sojourn", "Soldier: 76", "Sombra", "Symmetra", "Ashe", "Echo", "Widowmaker", "Junkrat", "Cassidy", "Torbjorn", "Tracer", "Pharah", "Hanzo"};
		String[] healer = {"Lifeweaver", "Lucio", "Mercy", "Moira", "Baptiste", "Brigitte", "Ana", "Illari", "Zenyatta", "Kiriko"};
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		
		// 사용자의 메인 포지션을 선택받기 위한 switch문 작성
		switch(select) {	
		case 1:
			// 사용자에게 탱커 캐릭터들의 이름을 for문을 사용해 표시하기
	        System.out.println("Ok, your main position is Tank. Here are the Tank Characters: ");
	        for (int i = 0; i < tank.length; i++) {
	            int tankNew = i + 1;
	            System.out.println(tankNew + ". " + tank[i]);
	        }
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
	        
	        // 사용자에게 좋아하는 탱커 캐릭터의 값을 if문으로 입력받기
	        System.out.println("Enter the number of your favorite Tank character:");
	        int tankChoice = s.nextInt();

	        if (tankChoice >= 1 && tankChoice <= tank.length) {
	            String selectedTank = tank[tankChoice - 1];
	            System.out.println("Oh, your favorite Tank character is " + selectedTank + ". I like to playing with " + selectedTank + ", too!");
	        } else {
	            System.out.println("Invalid choice. Please choose a number between 1 and " + tank.length);
	        }
	        System.out.println("----------------------------------------");
	        System.out.println("----------------------------------------");
	        break;
		
		case 2:
			// 사용자에게 딜러 캐릭터들의 이름을 for문을 사용해 표시하기
			System.out.println("Ok, your main position is Damage. Here are the Damage Characters: ");
			for (int j = 0; j < dps.length; j++) {
	            int dpsNew = j + 1;
	            System.out.println(dpsNew + ". " + dps[j]);
	        }
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");

			// 사용자에게 좋아하는 딜러 캐릭터의 값을 if문으로 입력받기
			System.out.println("Enter the number of your favorite Damage character:");
	        int dpsChoice = s.nextInt();

	        if (dpsChoice >= 1 && dpsChoice <= dps.length) {
	            String selectedDps = dps [dpsChoice - 1];
	            System.out.println("Oh, your favorite Damage character is " + selectedDps + ". I like to playing with " + selectedDps + ", too!");
	        } else {
	            System.out.println("Invalid choice. Please choose a number between 1 and " + dps.length);
	        }
	        System.out.println("----------------------------------------");
	        System.out.println("----------------------------------------");
	        break;
	        
			
		case 3:
			// 사용자에게 힐러 캐릭터들의 이름을 for문을 사용해 표시하기
			System.out.println("Ok, your main position is Support. Then, what is your favorite Support character?");
			System.out.println("Support Characters are: ");
			
			for (int k = 0; k < healer.length; k++) {
				int healerNew = k + 1;
				System.out.println(healerNew + ". " + healer[k]);
			}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");

			// 사용자에게 좋아하는 힐러 캐릭터의 값을 if문으로 입력받기
			System.out.println("Enter the number of your favorite Support character:");
			int healerChoice = s.nextInt();

			if (healerChoice >= 1 && healerChoice <= healer.length) {
				String selectedHealer = healer [healerChoice - 1];
				System.out.println("Oh, your favorite Support character is " + selectedHealer + ". I like to playing with " + selectedHealer + ", too!");
			} else {
				 System.out.println("Invalid choice. Please choose a number between 1 and " + healer.length);
			}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			break;
			
		default:
			System.out.println("Invalid choice. Please choose a number between 1 and 3.");
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			break;
		}
		
		// 사용자가 가장 자주 플레이하는 게임 모드를 물어보기 위한 Scanner와 switch문 작성
		System.out.println("Which game mode do you play the most?");
		System.out.println("- QP \n- Comp \n- Arcade \n- CG(custom game)");
		System.out.println("Type your favorite game mode(Put a word, not a number). (Please including uppercase. You don't have to type the words in ().)");
		String gameMode = s.next();
		System.out.println("----------------------------------------");
		
		// 게임 모드별 변수 선언
		String qp = "QP";
		String comp = "Comp";
		String arcade = "Arcade";
		String custom = "CG";
		
		// 게임 모드별 게임 형식을 위한 배열
		String qpMode[] = {"Control", "Escort", "Hybrid", "Push", "Flashpoint"};
		String arcMode[] = {"Assault", "Elimination", "Caputre The Flag", "Event mode"};
		
		// 게임 모드별 전장을 위한 배열 (빠른대전)
		String qpContMap[] = {"Antarctic Peninsula", "Nepal", "Lijiang Tower", "Busan", "Oasis", "Illios", "Samoa"};
		String qpEscoMap[] = {"Route 66", "Watchpoint: Gibraltar", "Dorado", "Rialto", "Shambali Monsatery", "Circuit Royal", "Junkertown", "Havana"};
		String qpHybrMap[] = {"Numbani", "Midtown", "Blizzard World", "Eichenwalde", "King's Row", "Paraiso", "Hollywood"};
		String qpPushMap[] = {"New Queen Street", "Esperanca", "Colosseo"};
		String qpFPMap[] = {"Suravasa", "New Junk City"};
		
		// 게임 모드별 전장을 위한 배열 (아케이드)
		String arcAssMap[] = {"Volskaya Industries", "Temple of Anubis", "Hanamura", "Paris", "Horizon Lunar Colony"};
		String arcElimMap[] = {"Black Forest", "Necropolis", "Castillo", "Ecopoint: Antarctica"};
		String arcCTFMap[] = {"Ayutthaya"};
		
		// 게임 모드별 전장을 위한 배열 (이벤트 한정 모드)
		String event[] = {"Junkenstein's Revenge", "Starwatch", "Lucioball", "Winston's Beach Volleyball"};
		
		// 사용자에게 좋아하는 게임 모드를 입력받기 위한 switch문
		System.out.println("----------------------------------------");
		switch(gameMode) {
		case "QP":
			System.out.println("Oh, you playing Quick Play the most!");
			
			System.out.println("Quick Play modes are: ");
			for (int q = 0; q < qpMode.length; q++) {
				int qpModeNew = q + 1;
				System.out.println(qpModeNew + ". " + qpMode[q]);
			}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");

			// 사용자가 좋아하는 게임 모드를 입력받기
			System.out.println("Enter the number of your favorite Quick Play game mode:");
			int qpChoice = s.nextInt();

			if (qpChoice >= 1 && qpChoice <= qpMode.length) {
			    String selectedQp = qpMode[qpChoice - 1];
			    System.out.println("Oh, your favorite Quick Play game mode is " + selectedQp + ". I like playing " + selectedQp + " too!");
			    System.out.println("----------------------------------------");
			    System.out.println("----------------------------------------");
			    System.out.println("Then, what is your favorite map of " + selectedQp + " mode?");

			    // 선택한 모드에 해당하는 맵 배열을 가져오기
			    String[] selectedMapArray;
			    switch (selectedQp) {
			        case "Control":
			            selectedMapArray = qpContMap;
			            break;
			        case "Escort":
			            selectedMapArray = qpEscoMap;
			            break;
			        case "Hybrid":
			            selectedMapArray = qpHybrMap;
			            break;
			        case "Push":
			            selectedMapArray = qpPushMap;
			            break;
			        case "Flashpoint":
			            selectedMapArray = qpFPMap;
			            break;
			        default:
			            selectedMapArray = new String[0]; // 기본값으로 빈 배열 설정
			    }

			    // 선택한 모드에 해당하는 맵 보여주기
			    for (int m = 0; m < selectedMapArray.length; m++) {
			        int mapNumber = m + 1;
			        System.out.println(mapNumber + ". " + selectedMapArray[m]);
			    }

			    // 사용자가 맵을 선택할 수 있도록 입력 받기
			    System.out.println("Enter the number of your favorite map:");
			    int mapChoice = s.nextInt();

			    if (mapChoice >= 1 && mapChoice <= selectedMapArray.length) {
			        String selectedMap = selectedMapArray[mapChoice - 1];
			        System.out.println("Oh, your favorite map is " + selectedMap + ". Enjoy your game!");
			    } else {
			        System.out.println("Invalid choice. Please choose a number between 1 and " + selectedMapArray.length);
			    }
			} else {
			    System.out.println("Invalid choice. Please choose a number between 1 and " + qpMode.length);
			}

			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			break;
		
			
		// 경쟁전
		case "Comp":
			System.out.println("Oh, you playing Competitive mode the most!");
			
			System.out.println("Competitive modes are: ");
			for (int q = 0; q < qpMode.length; q++) {
				int qpModeNew = q + 1;
				System.out.println(qpModeNew + ". " + qpMode[q]);
			}
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");

			// 사용자가 좋아하는 게임 모드를 입력받기
			System.out.println("Enter the number of your favorite Competitive game mode:");
			int compChoice = s.nextInt();

			if (compChoice >= 1 && compChoice <= qpMode.length) {
			    String selectedComp = qpMode[compChoice - 1];
			    System.out.println("Oh, your favorite Competitive game mode is " + selectedComp + ". I like playing " + selectedComp + " too!");
			    System.out.println("----------------------------------------");
			    System.out.println("----------------------------------------");
			    System.out.println("Then, what is your favorite map of " + selectedComp + " mode?");

			    // 선택한 모드에 해당하는 맵 배열을 가져오기
			    String[] selectedMapArray;
			    switch (selectedComp) {
			        case "Control":
			            selectedMapArray = qpContMap;
			            break;
			        case "Escort":
			            selectedMapArray = qpEscoMap;
			            break;
			        case "Hybrid":
			            selectedMapArray = qpHybrMap;
			            break;
			        case "Push":
			            selectedMapArray = qpPushMap;
			            break;
			        case "Flashpoint":
			            selectedMapArray = qpFPMap;
			            break;
			        default:
			            selectedMapArray = new String[0]; // 기본값으로 빈 배열 설정
			    }

			    // 선택한 모드에 해당하는 맵 보여주기
			    for (int m = 0; m < selectedMapArray.length; m++) {
			        int mapNumber = m + 1;
			        System.out.println(mapNumber + ". " + selectedMapArray[m]);
			    }

			    // 사용자가 맵을 선택할 수 있도록 입력 받기
			    System.out.println("Enter the number of your favorite map:");
			    int mapChoice = s.nextInt();

			    if (mapChoice >= 1 && mapChoice <= selectedMapArray.length) {
			        String selectedMap = selectedMapArray[mapChoice - 1];
			        System.out.println("Oh, your favorite map is " + selectedMap + ". Enjoy your game!");
			    } else {
			        System.out.println("Invalid choice. Please choose a number between 1 and " + selectedMapArray.length);
			    }
			} else {
			    System.out.println("Invalid choice. Please choose a number between 1 and " + qpMode.length);
			}

			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			break;
			
			// 아케이드
		case "Arcade":
		    System.out.println("Oh, you playing Arcade mode the most!");
		    
		    System.out.println("Arcade modes are: ");
		    for (int q = 0; q < arcMode.length; q++) {
		        int arcModeNew = q + 1;
		        System.out.println(arcModeNew + ". " + arcMode[q]);
		    }
		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");

		    // 사용자가 좋아하는 게임 모드를 입력받기
		    System.out.println("Enter the number of your favorite Arcade game mode:");
		    int arcadeChoice = s.nextInt();

		    if (arcadeChoice >= 1 && arcadeChoice <= arcMode.length) {
		        String selectedArcade = arcMode[arcadeChoice - 1];
		        System.out.println("Oh, your favorite Arcade game mode is " + selectedArcade + ". I like playing " + selectedArcade + " too!");
		        System.out.println("----------------------------------------");
		        System.out.println("----------------------------------------");
		        System.out.println("Then, what is your favorite map of " + selectedArcade + " mode?");

		        // 선택한 모드에 해당하는 맵 배열을 가져오기
		        String[] selectedMapArray;
		        switch (selectedArcade) {
		            case "Assault":
		                selectedMapArray = arcAssMap;
		                break;
		            case "Elimination":
		                selectedMapArray = arcElimMap;
		                break;
		            case "Caputre The Flag":
		                selectedMapArray = arcCTFMap;
		                break;
		            case "Event mode":
		                selectedMapArray = event; // 이벤트 모드의 맵 배열 사용
		                break;
		            default:
		                selectedMapArray = new String[0]; // 기본값으로 빈 배열 설정
		        }

		        // 선택한 모드에 해당하는 맵 보여주기
		        for (int m = 0; m < selectedMapArray.length; m++) {
		            int mapNumber = m + 1;
		            System.out.println(mapNumber + ". " + selectedMapArray[m]);
		        }

		        // 사용자가 맵을 선택할 수 있도록 입력 받기
		        System.out.println("Enter the number of your favorite map:");
		        int mapChoice = s.nextInt();

		        if (mapChoice >= 1 && mapChoice <= selectedMapArray.length) {
		            String selectedMap = selectedMapArray[mapChoice - 1];
		            System.out.println("Oh, your favorite map is " + selectedMap + ". Enjoy your game!");
		        } else {
		            System.out.println("Invalid choice. Please choose a number between 1 and " + selectedMapArray.length);
		        }
		    } else {
		        System.out.println("Invalid choice. Please choose a number between 1 and " + arcMode.length);
		    }

		    System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");
		    break;

		case "CG":
			System.out.println("Oh, you playing Custom game mode the most!");
			System.out.println("Sometimes I'm playing Custom game, when I'm waiting of the que.");
			System.out.println("Anyways, enjoy your game!");
			System.out.println("----------------------------------------");
		    System.out.println("----------------------------------------");
		    break;
		}
		s.close();
	}

}


