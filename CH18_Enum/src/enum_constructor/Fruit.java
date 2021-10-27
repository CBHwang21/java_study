package enum_constructor;

public enum Fruit {	//	enum은 상수(변하지 않는 값)들의 집합
	APPLE("초록색"), BANANA("노란색"), ORANGE("오렌지색");	// 애플, 바나나, 오렌지 열거
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + "("+color+")";
	}
}
