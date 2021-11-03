package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int NUM = 5;	// 배열의 크기
		
		int[] numbers = new int[NUM];
		
		for (int  i = 0;  i<NUM; i++) {
			System.out.println("숫자를 입력 : ");
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0;	// 숫자의 합을 계산할 변수
		for (int i = 0; i < NUM; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i];	// 배열의 아이템 하나하나의 값을 더함
		}
		
		System.out.println("합계 : " + total);
	}

}
