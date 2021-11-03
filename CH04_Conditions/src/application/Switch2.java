package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// 스캐너 생성
		
		System.out.println("계속 진행하겠습니까? (y/n) : ");
		String input = scanner.nextLine();	// 스캐너 문자열 입력
		scanner.close();
		
		switch(input) {
		case "y":
			System.out.println("진행합니다...");
			break;
		case "n":
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}

	}

}
