package exam;

import java.util.ArrayList;

public class TotalChickenPrice {

	public static <Chicken> void main(String[] args) {
		// ArrayList 생성
		ArrayList<Chicken> order = new ArrayList<Chicken>();

		/* 1. 주문한 치킨을 ArrayList에 추가하세요. */
		order.add(new Chicken("후라이드 치킨", 9900));
		order.add(new Chicken("양념 치킨", 10900));
		order.add(new Chicken("간장 치킨", 10900));
		
		/* 2. ArrayList를 순회하여 총합을 구하세요 */
		int sum = 0;
		
		// 결과 출력
		System.out.printf("총합 : %d원\n", sum);
	}

}

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public int getPrice() {
		return pirce;
	}
}
