package event;


public class Event {
	public static int getRandomCoupon(){
		// 랜덤함수이용
		int c = 1;
		int coupon = (int)((Math.random()*10)+1)*1000;
		return coupon;
	}

}
