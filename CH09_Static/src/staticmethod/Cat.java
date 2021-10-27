package staticmethod;

public class Cat {
	private String name; // 고양이 이름
	private int id;	// 고양이 아이디
	public static final String FOOD = "고양이 사료";
	// 스태틱 변수는 객체에서 공유가능
	private static int count = 0;	// 생성한 고양이의 숫자
	
	public Cat(String name) {	// 생성자는 리턴 타입이 없음(일반 메소드랑 다름)
		this.name = name;
		// 코드추가
		count++;	// 고양이 객채 생성시 스태틱 count가 +1됨
		id = count;
	}

	@Override
	public String toString() {	// toString 메소드 자동생성
		return "고양이 [아이디 = " + id + ", 이름 = " + name + "]";
	}
	
	public static int getCount() {	// 스태틱 메소드
		//String n = name; 스태틱 메소드에서 인스턴스(객체) 변수를 사용할 수 없다.
		return count;
		
		
	}
	
}
