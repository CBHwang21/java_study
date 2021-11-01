package remove_Items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name; // 이름

	public Cat(String name) { // 생성자(이름)
		this.name = name;
	}

	public String toString() { // toString 리턴 이름
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		// 리스트의 아이템을 제거
		Cat c1 = new Cat("마틸다");

		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));

		cats.forEach(System.out::println);
		System.out.println();

		cats.remove(1); // 인덱스 번호

		cats.forEach(System.out::println);
		System.out.println();

		cats.remove(c1); // 마틸다 객체의 주소

		cats.forEach(System.out::println);
		System.out.println();

	}

}
