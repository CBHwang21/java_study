package hashSet;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// 셋(set)형은 순서가 없고 데이터의 중복 안됨
		HashSet<String> fruits = new HashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 셋 리스트에 특정 아이템이 있는지 확인
		System.out.println(fruits.contains("오렌지"));
		
	}

}
