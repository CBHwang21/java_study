package application;

import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
		// f1.id = 다른 패키지에서는 protected 접근 불가
		System.out.println(f1);
		
		Fruit f2 = new Banana();
		
		System.out.println(f2);
	}
}
