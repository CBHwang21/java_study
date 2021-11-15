package event;

import java.util.HashMap;

public class Sale {

	public static int getRandomDiscount() {
		int d = (int)((Math.random()*10)+1)*100;
		return d;
	}

	public static String getRandomProduct() {
		HashMap<Integer, String> product = new HashMap<>();

		product.put(1, "육류");
		product.put(2, "채소");
		product.put(3, "잡화");
		product.put(4, "주류");
		product.put(5, "과일");
		product.put(6, "곡류");
		product.put(7, "제과");
		product.put(8, "유제품");
		product.put(9, "해산물");
		product.put(10, "물,음료");
		product.put(11, "냉동식품");
		product.put(12, "즉석식품");

		int p = (int) (Math.random() * 12 + 1);
		return product.get(p);
	}
}
