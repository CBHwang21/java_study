package application;

import java.util.Random;

public class RandomWord {
	private String books = "leadership efficiency election assistance signature relation confusion government pollution enthusiasm conversation importance childhood judgment refrigerator preference attitude departure consequence apartment";
	private String[] words = books.split(" ");
	
	private String selectWord;	// ������ �ܾ�
	private Random rand = new Random();	// ���� ��ü�� ����
	
	public RandomWord() {
		selectWord = words[rand.nextInt(words.length)];	// �������� �ܾ ����
	}
	
	public String toSting() {
		return selectWord;
	}
	
	public void getWords() {
		for(String w : words) {
			System.out.println(w);
		}
	}
}
