package application;

import java.util.Scanner;

public class IfElseElse {

	public static void main(String[] args) {
		// If 문
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("사과의 갯수는 ? ");
		int apples = scanner.nextInt();

		System.out.println("바나나의 갯수는 ? ");
		int bananas = scanner.nextInt();

		scanner.close();
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if(apples < bananas) {	// if문의 조건이 false일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		else {	// 같을 경우
			System.out.println("갯수가 같음");
		}
		
		System.out.println("프로그램 종료.");

	}

}
