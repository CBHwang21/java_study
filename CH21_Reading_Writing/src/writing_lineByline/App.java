package writing_lineByline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 절대경로를 문자열로 표시(\\로 표시됨)
		String fileLocation = "D:\\Java\\java_study\\CH21_Reading_Writing\\text2.txt";
		System.out.println(new File(fileLocation).exists()); // exist : 파일이 있으면 true 없으면 false로 리턴
		System.out.println();

		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation))) {
			br.write("오렌지");
			br.newLine();
			br.write("애플");
			br.newLine();
			br.write("바나나");
			br.newLine();
			br.write("배");
			
		} catch (IOException e) {
			System.out.println("파일을 쓸수가 없음 : " + fileLocation);
		}
		
		System.out.println("파일 쓰기 완료 : " + fileLocation);

	}
}
