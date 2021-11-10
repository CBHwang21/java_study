package Mart;

import java.util.HashMap;


public class Sale {

	public static void main(String[] args) {
		// 오늘의 행사상품

		HashMap<Integer, String> product = new HashMap<>();

		product.put(1, "육류");
		product.put(2, "채소류");
		product.put(3, "냉동식품");
		product.put(4, "유제품");
		product.put(5, "잡화");
		product.put(6, "주류");
		product.put(7, "물, 음료");
		product.put(8, "곡류");
		product.put(9, "계란");
		product.put(10, "해산물");
		product.put(11, "제과류");
		product.put(12, "즉석식품");

		int p = (int) (Math.random() * 12 + 1);
		
		int d = (int) (Math.random() * 10 + 1);

		System.out.println("오늘의 할인상품은 " + product.get(p) + "이고" + " " + d + "%를 할인해드립니다.");

	}

}
