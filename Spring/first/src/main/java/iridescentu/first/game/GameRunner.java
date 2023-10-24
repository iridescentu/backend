package iridescentu.first.game;

public class GameRunner {

//	MarioGame game;
//	SuperContraGame game;
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		super();
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
