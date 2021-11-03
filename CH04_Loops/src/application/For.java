package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값; 조건; 증감) { 명령문; }
		
		int total = 0;
		for(int i=1; i<=100; i++) {
			total += i;
			System.out.println(total);
		}
		System.out.println(total);
		
		/* 여러줄 주석
		for(;;) {
			System.out.println("무한반복");
		}
		*/
	}

}
