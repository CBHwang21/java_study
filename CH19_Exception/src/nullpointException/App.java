package nullpointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// null포인터, 0으로 나누었을때 => 런타임 예외 발생
		// 1. 0으로 나누었을때
		try {
		System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
	}
	
	// 2. 객체의 주소값이 null일때!!!
	Scanner scanner = null;	//	new Scanner(System.in);
	
	try {
		sacnner.nextLine();
		scanner.close();
	} catch (nullpointException e) {
		System.out.println("객체의 값이 null입니다.");
	}
	
	}
}
