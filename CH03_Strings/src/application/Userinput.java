package application;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// 입력을 받는 클래스 scanner 이용
		Scanner scanner = new Scanner(System.in);	// 스캐너를 사용할 수 있게 생성
		System.out.println("온도를 입력해 주세요 : ");
		double c = Scanner.nextInt();	// 스캐너 객체의 nextINT() 메소드로 정수값을 입력
		double f = (c * 9/5) + 32;	// 화씨
		
		System.out.println("섭씨 "+c+"는 화씨 "+f+"이다.");

	}

}
