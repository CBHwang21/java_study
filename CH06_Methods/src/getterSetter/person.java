package getterSetter;

public class person {
	// 클래스 안에 만든 변수를 인스턴스 변수라 하고 => 객체 생성시 사용가능(생성됨)
	private String name;
	private int age;
	// get, set 메소드로 변수에 접근
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
}
