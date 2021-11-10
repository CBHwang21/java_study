package Mart;

import java.util.Random;

public class Event {

	public static void main(String[] args) {
		// 랜덤함수이용
		Random coupon = new Random();
		for(int i=1; i<=10; i++); 
		System.out.printf("뽑기결과 : %d원 할인쿠폰\n", (coupon.nextInt(10)+1)*1000);
	}

}
