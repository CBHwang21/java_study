package application;

import java.util.Random;

public class Hangman {
	
	private boolean running = false;
	private RandomWord word = new RandomWord();
	
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
		System.out.println("�ܾ���߱�");
		
	}

	private void displayWord() {
		// ���� �ܾ� ���
		System.out.println(word.toSting());
		
	}

}
