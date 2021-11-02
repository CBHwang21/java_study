package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드를 입력받아 do while문으로 맞는지 검사 맞으면 반복문 빠져나옴
		Scanner scanner = new Scanner(System.in);
		
		final String USER_PASSWORD = "hello";
		
		String password = "";
		do {
			System.out.println("비밀번호 입력 : ");
			password = scanner.nextLine();
			
		} while (!password.equals(USER_PASSWORD));	// !는 반대
		
		scanner.close();
		System.out.println("접속 승인.");

	}

}
