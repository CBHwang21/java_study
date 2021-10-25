package static_innerClass;

public class Person {
	class Head {	// 내부클래스 Head
		public void print() {
			System.out.println("헤드");
		}
	}
	
	static class Body {	// 스테틱 내부 클래스 Body
		public void print() {
			System.out.println("바디");
		}
	}
	public void print() {	// 클래스 Person의 메소드
		Head head = new Head();	// Head 객체
		Body body = new Body();	// Body 객체
		
		head.print();
		body.print();
	}
}
