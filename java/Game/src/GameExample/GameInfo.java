package GameExample;

//import CarExample.Car1;

public class GameInfo {

	public static void main(String[] args) {
		Game1 myGame = new Game1();
		
		// Game 객체의 필드값 읽기
		System.out.println("Company: " + myGame.company);
		System.out.println("Name: " + myGame.name);
		System.out.println("Genre: " + myGame.genre);
		System.out.println("Platform: " + myGame.platform);
		System.out.println("Year: " + myGame.year);
		


	}

}
