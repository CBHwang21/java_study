package application;

public class StringEquals {

	public static void main(String[] args) {
		// 문자열이 같은지 비교
		String text1 = "apple";
		String text2 = "apple1";
		
		System.out.printf("두개의 문자열 일치 : %b\n", text1 == text2);
		System.out.printf("두개의 문자열 일치 : %b\n", text1.equals(text2));
		

	}

}
