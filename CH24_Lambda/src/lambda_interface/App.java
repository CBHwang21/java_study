package lambda_interface;

import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		// Predicate는 제네렉 T 타입을 검사해서(test 메소드) boolean(참/거짓) 리턴한다.
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// 추상메소드 테스트 리턴값(참/거짓), 문자열 매개변수1
				return t.length() < 4;	// 문자열의 길이가 4보다 작으면 참, 아니면 거짓
			}
		};
		
		System.out.println(p1.test("abcd"));
		System.out.println(p1.test("하나둘"));

		Predicate<String> p2 = t -> t.length() < 4;
		
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘"));
	}

}
