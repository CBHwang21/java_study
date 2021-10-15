package application;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		// ���� ����
		
		//1. ȭ�鿡 �ܾ�ǥ��
		//2. ö�� �Է�
		//3. ö�ڰ� �´��� üũ (�ٸ����� ����)
		do {
			displayWord();		// ȭ�鿡 �ܾ�ǥ��
			getUserInput();		// �Է¹���
			checkUserInput();	// �´��� üũ �ٸ����� running = false
			
		} while (running);
		
	}

	private void checkUserInput() {
		System.out.println("üũ");
		
	}

	private void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ���� => addguess(����) �޼ҵ�
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
		
	}

	private void displayWord() {
		// ���� �ܾ� ���
		System.out.println(word.toSting());
		
	}

}
