package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 책파일을 불러와서 단어로 정렬, 출력
		File wordsSherlock = new File("Sherlock.txt");
		File wordsDra = new File("Dracula.txt");

		System.out.println(wordsSherlock.exists());
		System.out.println(wordsDra.exists());

		TreeSet<String> sherlist = loadWords(wordsSherlock);
		TreeSet<String> dralist = loadWords(wordsDra);

		System.out.println(sherlist.size());
		System.out.println(dralist.size());

		displayWords(sherlist);

	}

	private static void displayWords(TreeSet<String> list) {
		// 트리셋을 입력받아 그 안의 단어들을 출력한다.
		int count = 0;
		for (String w : list) {
			if (w.length() >= 6) {
				System.out.printf("%-10s \t", w);
				count++;
				if (count == 6) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

	private static TreeSet<String> loadWords(File file) throws FileNotFoundException, IOException {
		// 파일을 입력하면 읽어서 단어들을 TreeSet으로 리턴
		TreeSet<String> wordSet = new TreeSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = null;
			while ((line = br.readLine()) != null) { // 파일을 한줄씩 읽다가 마지막글을 읽고나면 종료
				String[] words = line.split("[^a-zA-Z]+"); // 영문 단어 배열로 리턴

				for (String w : words) {
					if (w.length() < 2)
						continue; // 단어가 철자1개 이하는 제외
					wordSet.add(w.toLowerCase()); // 단어들을 소문자로 리스트에 추가
				}
			}
		}

		return wordSet;
	}

}
