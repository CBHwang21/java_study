package instanceOf;

import java.io.Serializable;

//크리처 클래스는 시리얼 인터페이스를 구현하여 디폴트 id를 만들었음
class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
}

//Cat 클래스는 Creature 클래스를 상혹해서 디폴트 id를 만들었음
class Cat extends Creature{
	private static final long serialVersionUID = 1L;
}

public class App {

	public static void main(String[] args) {
		// 객체의 타입을 판별한다.
		Creature c1 = new Creature();
		Object c2 = c1;	// Object는 최상위 클래스 타입으로 어느 클래스 타입에도 선언가능(업캐스팅)
		
		Cat c3 = new Cat();
		
		Serializable c4 = (Serializable)c3;
		
		System.out.println(c3 instanceof Object);	// Object는 최상위 클래스이므로 true
		
		System.out.println(c3 instanceof Serializable);	// Serializable 인터페이스 구현했기 때문에 true 
		
		System.out.println(c3 instanceof Creature);	// 크리처 클래스의 객체임
		
		System.out.println(c3 instanceof Cat);	// c1은 캣 클래스는 아니므로 false
		
	}

}
