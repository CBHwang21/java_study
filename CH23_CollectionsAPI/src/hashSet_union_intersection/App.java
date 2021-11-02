package hashSet_union_intersection;

import java.util.HashSet;

public class App {

	public static void main(String[] args) {
		// 헤쉬셋 합집합 교집합
		HashSet<String> fruits1 = new HashSet<>();
		fruits1.add("사과");
		fruits1.add("배");
		fruits1.add("딸기");
		fruits1.add("수박");

		HashSet<String> fruits2 = new HashSet<>();
		fruits2.add("체리");
		fruits2.add("배");
		fruits2.add("사과");
		fruits2.add("오렌지");
		
		// 합집합 리스트를 만들기
		// 생성자의 ()안에 리스트를 넣으면 넣은 리스트의 모든 값이 입력된 리스트가 생성
		HashSet<String> union = new HashSet<>(fruits1);
		
		union.forEach(System.out::println);
		
		union.addAll(fruits2);	// 현재 리스트에 fruits2 리스트를 합침
		
		System.out.println();
		union.forEach(System.out::println);
		
		HashSet<String> intersection = new HashSet<>(fruits1);
		
		intersection.retainAll(fruits2);	// retainAll : 첫번째 리스트와 두번째 리스트가 같은 아이템만 남김
		
		System.out.println();
		intersection.forEach(System.out::println);
		
		// 마이너스 A - B : 두번째 리스트로 빼고 남은 아이템
		
		HashSet<String> minus = new HashSet<>(fruits1);
		minus.removeAll(fruits2);
		
		System.out.println();
		minus.forEach(System.out::println);
	}

}
