package references;

public class App {

	public static void main(String[] args) {
		// 레퍼런스(참조, 주소값) 변수
		Person p1 = new Person();	// p1은 객체가 생성된 위치 즉 주소값을 가진다.
		
		System.out.println(p1);		// 객체의 주소를 출력
		
		Person p2 = p1;				// p2에 p1의 값 즉 주소값을 넘김
		
		System.out.println(p2);
		
		Person p3 = new Person();
		
		System.out.println(p3);		// p3은 다른객체이기 때문에 주소가 다름
		
		test(p2);
	}

	private static void test(Person person) {
		System.out.println(person);
		
	}

}
