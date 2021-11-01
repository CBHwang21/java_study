package arrayList;

// 정렬이 가능하도록 Comparable 인터페이스를 구현한다.
public class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person o) {	// 이름을 가지고 비교한다.
		// 비교할 내용을 직접 만든다.
		return name.compareTo(o.name);	// 알파벳 순으로 문자열 비교 메소드
	}
}

