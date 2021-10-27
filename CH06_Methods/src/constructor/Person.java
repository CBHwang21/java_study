package constructor;

public class Person {
	private String name;
	private double height;
	
	// 생성자
	public Person() {
		// 기본 생성자(매개변수 없음)는 생략가능
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
}
