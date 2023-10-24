package iridescentu.first.game;

public class AppGaming {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var superGame = new SuperContraGame();
		var pacmanGame = new PacmanGame();
		var gameRunner = new GameRunner(pacmanGame);
		gameRunner.run();
	}
}
