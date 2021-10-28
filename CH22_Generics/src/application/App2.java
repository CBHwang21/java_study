package application;

import collections.Pair;
import hierarchy.Cat;
import hierarchy.Creature;

public class App2 {

	public static void main(String[] args) {
		// 제네릭 타입 클래스는 객체를 만들때 타입을 지정한다.
		// Integer는 숫자int의 클래스형
		Pair<Integer, Cat> pair = new Pair<>(5, new Cat("마틸다"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
	}

}
