package application;

public class App {

	public static void main(String[] args) {
		// Hangman 프로그램 시작
		Hangman game = new Hangman();
		game.run();	// 게임시작
		game.close(); //게임 종료
		
	}

}
