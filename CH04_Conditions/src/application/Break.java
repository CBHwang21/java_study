package application;

public class Break {

	public static void main(String[] args) {
		// 반복문 안에서 빠져나오는 명령어 break;
		int count = 0;
		
		while(true) {
			System.out.println("헬로우~ " + count);
			
			if(count == 5) break;
			
			System.out.println("하와유?");
			count++;
		}
		
		System.out.println("프로그램 종료.");

	}

}
