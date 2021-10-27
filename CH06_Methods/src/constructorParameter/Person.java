package constructorParameter;

public class Person {
	// 변수
	private String name;
	private double height;
	
	public Person() {
		// 기본 생성자
		name = "신원미상";
		height = 0.0;
		System.out.println("한 사람을 생성!");
	}
	
	// 생성자(이름, 키)
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람을 생성!");
	}
	
	// get set 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public String toString() {
		return "이름 : " + name + " 키 : " + height;
	}
}
