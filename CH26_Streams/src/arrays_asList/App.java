package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		// 배열을 리스트로
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
		
		names.stream()
			.filter(name -> name.contains("a"))	//문자열에 a가 있으면 참 아니면 거짓
			.map(String::toUpperCase)			// 대문자
			.forEach(System.out::println);		// 출력
			
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(9, 4, 6, 3, 2, 1);
		
		numbers.stream()
			.filter(n -> n>3)	// 9, 4, 6만 남는다
			.sorted()			// 4, 6, 9로 정렬
			.map(n -> n*10)		// 40, 60, 90
			.forEach(System.out::println);

	}

}
