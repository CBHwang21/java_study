package stream_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Stream {
	public static void main(String[] args) throws IOException {
		
		// lines메소드는 파일을 읽어서 한줄씩 문자열 스트림으로 생성
		Files.lines(Paths.get("Dracula.txt")).forEach(System.out::println);
		// 파일의 위치는 프로젝트 파일에 위치해야 한다.(패키지 파일에 넣으면 오류발생)
	}

}
