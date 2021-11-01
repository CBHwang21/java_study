package list_Interface;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		// 리스트 인터페이스의 addAll(리스트) 추가
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		
		displayList(list1);	// 리스트내용을 출력하는 메소
		
		System.out.println();
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.addAll(list1);	// 리스트1의 내용을 리스트2에 모두 입력
		list2.add(4);
		list2.add(5);
		
		displayList(list2);

	}

	private static void displayList(List<Integer> list) {
		// 매개변수로 리스트 객체를 입력받아 리스트 내용을 전부 출력
		list.forEach(System.out::println);
	}
	
	

}
