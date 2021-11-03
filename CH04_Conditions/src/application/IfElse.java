package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// If 문
		Scanner scanner = new Scanner(System.in);	// 스캐너 설정
		
		System.out.println("사과의 갯수는 ? ");
		int apples = scanner.nextInt();
		
		System.out.println("바나나의 갯수는 ? ");
		int bananas = scanner.nextInt();
		
		scanner.close();
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else {	// if문의 조건이 false일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		
		System.out.println("프로그램 종료.");

	}

}
