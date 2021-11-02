package test;

public class Income {

	public static void main(String[] args) {
		// 1. 변수 생성
		int sum = 0;
		double [] income = { 8.62, 10.23, 12.48, 7.82, 9.54 };
		// 2. 총합 계산
		for (double i=0; i < income.length; i++); {
			sum += income[sum];
		// 3. 총합 출력
			
		System.out.println("총합 : " + sum);
		}
	}

}
