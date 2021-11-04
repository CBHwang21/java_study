package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {
	public static void main(String[] args) {
		// 정수형 스트림 IntStream
		IntStream
			.range(1, 10)		// 1~10까지 정수(range는 뒤에 표시된 숫자의 -1까지의 범위)
			.skip(5)			// 5개 아이템 스킵(넘어감)
			.forEach(x -> System.out.println(x));
		
		System.out.println();
		
		int val = IntStream.range(1, 101).sum();
		System.out.println(val);

	}

}
