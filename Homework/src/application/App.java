package application;

import market.Market;

public class App {

	public static void main(String[] args) {
		
		Market market = new Market();
		
		market.setTitle("My Market");	// 샵의 제목
		market.genProduct();			// 상품생성
		market.setExistingUsers("hcb21", "1234");			// 기존회원 생성
		market.setExistingUsers("daydreamer00", "5678");	// 기존회원 생성
		market.initAlarm();		// 메뉴선택

	}

}
